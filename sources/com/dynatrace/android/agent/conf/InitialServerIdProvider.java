package com.dynatrace.android.agent.conf;

import com.dynatrace.android.agent.data.RandomFactory;

/* JADX INFO: loaded from: classes2.dex */
public class InitialServerIdProvider {
    private static final int DEFAULT_SERVER_ID = 1;
    static RandomFactory randomFactory = new RandomFactory();

    public int getDefaultServerId(Configuration configuration) {
        if (configuration == null || !configuration.startupLoadBalancing) {
            return 1;
        }
        return (-randomFactory.generateRandom().nextInt(32767)) - 2;
    }
}
