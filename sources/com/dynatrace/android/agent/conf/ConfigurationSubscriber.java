package com.dynatrace.android.agent.conf;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface ConfigurationSubscriber {
    void notify(Map<String, ? extends Object> map);
}
