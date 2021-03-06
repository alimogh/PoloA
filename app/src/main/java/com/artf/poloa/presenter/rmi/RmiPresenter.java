package com.artf.poloa.presenter.rmi;

import android.support.annotation.Nullable;

import com.artf.poloa.data.entity.WrapJSONArray;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


public class RmiPresenter implements RmiMVP.Presenter {

    @Nullable
    private RmiMVP.Thread thread;
    private RmiMVP.Model model;
    private CompositeDisposable disposable = new CompositeDisposable();

    public RmiPresenter(RmiMVP.Model model) {
        this.model = model;
    }
    private Scheduler scheduler;

    @Override
    public void returnChartData(String ccName, int timePeriod) {
//        if(scheduler == null) {
//            int threadCount = Runtime.getRuntime().availableProcessors();
//            ExecutorService threadPoolExecutor = Executors.newFixedThreadPool(threadCount);
//            scheduler = Schedulers.from(threadPoolExecutor);
//        }

        DisposableObserver<WrapJSONArray> disposableObserver = model.returnChartData(ccName, timePeriod).observeOn(Schedulers.io()).
                subscribeOn(Schedulers.io()).subscribeWith(new DisposableObserver<WrapJSONArray>() {

            @Override
            public void onNext(@NonNull WrapJSONArray postParent) {
                if (thread != null) {
                    thread.returnChartData(postParent);
                }
            }

            @Override
            public void onError(@NonNull Throwable e) {
                //checkConnection();
            }

            @Override
            public void onComplete() { }

        });
        disposable.add(disposableObserver);
    }

    @Override
    public void onStop() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }


    @Override
    public void setThread(RmiMVP.Thread thread) {
        this.thread = thread;
    }
}
