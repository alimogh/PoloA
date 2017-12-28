package com.artf.poloa.utility;

import com.artf.poloa.data.entity.TradeObject;

import java.util.HashMap;

public class Settings {

    public static class Trade {
        public static final HashMap<String, TradeObject> CC_LIST = new HashMap<String, TradeObject>() {{
            put("AMP", new TradeObject(0d, 0.00004330));
            put("ARDR", new TradeObject(0d, 0.00010774));
            put("BTS", new TradeObject(0d, 0.00003599));
            put("CVC", new TradeObject(0d, 0.00005900));
            put("DGB", new TradeObject(0d, 0.00000403));
            put("EMC2", new TradeObject(0d, 0.00005786));
            put("ETC", new TradeObject(0d, 0.00188080));
            put("ETH", new TradeObject(0d, 0.04827000));
            put("EXP", new TradeObject(0d, 0.00039493));
            put("FCT", new TradeObject(0d, 0.00286296));
            put("GAME", new TradeObject(0d, 0.00026827));
            put("GNT", new TradeObject(0d, 0.00005776));
            put("LSK", new TradeObject(0d, 0.00161031));
            put("LTC", new TradeObject(0d, 0.01708497));
            put("MAID", new TradeObject(0d, 0.00005949));
            put("OMG", new TradeObject(0d, 0.00096345));
            put("REP", new TradeObject(0d, 0.00526408));
            put("SC", new TradeObject(0d, 0.00000200));
            put("STR", new TradeObject(0d, 0.00001404));
            put("STRAT", new TradeObject(0d, 0.00089586));
            put("SYS", new TradeObject(0d, 0.00005699));
            put("VTC", new TradeObject(0d, 0.00047678));
            put("XEM", new TradeObject(0d, 0.00006047));
            put("XMR", new TradeObject(0d, 0.02411091));
            put("XRP", new TradeObject(0d, 0.00008221));
            put("ZEC", new TradeObject(0d, 0.03446435));
        }};

        public static final double AVAILABLE_BTC_FOR_TRADE_PERCENTAGE = 0.01;
        public static final double SELL_IF_DROPPED_PERCENTAGE = 0.99;

    }

    public static class Trend {
        public static final double RULE_LONG_TREND = 1.0;
    }

    public static class RMI {
        public static final int LENHTH = 20;
        public static final int MOMENTUM = 4;
        public static final int SIGNAL = 4;
        public static final int OVER_BOUGHT = 70;
        public static final int OVER_SOLD = 40;
    }

    public static class Stochastic {
        public static final int LENHTH = 14;
        public static final int SIGNAL = 3;
    }


}