package com.dynatrace.android.agent.conf;

import androidx.annotation.VisibleForTesting;
import cj.L;
import cj.M;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jj.InterfaceC1685a;
import k2.v0;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationPublisher {
    private Map<String, Object> configurationsMap;
    private final Object lock;
    private final int maxSubscribers;
    private final Set<ConfigurationSubscriber> subscribers;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConfigChange {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ ConfigChange[] $VALUES;
        public static final ConfigChange IS_3RDGEN_ENABLED = new ConfigChange("IS_3RDGEN_ENABLED", 0, "3rd_gen_enabled");
        public static final ConfigChange IS_TOUCHES_ENABLED = new ConfigChange("IS_TOUCHES_ENABLED", 1, "touch_interaction_enabled");
        private final String id;

        private static final /* synthetic */ ConfigChange[] $values() {
            return new ConfigChange[]{IS_3RDGEN_ENABLED, IS_TOUCHES_ENABLED};
        }

        static {
            ConfigChange[] configChangeArr$values = $values();
            $VALUES = configChangeArr$values;
            $ENTRIES = v0.h(configChangeArr$values);
        }

        private ConfigChange(String str, int i, String str2) {
            this.id = str2;
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static ConfigChange valueOf(String str) {
            return (ConfigChange) Enum.valueOf(ConfigChange.class, str);
        }

        public static ConfigChange[] values() {
            return (ConfigChange[]) $VALUES.clone();
        }

        public final String getId() {
            return this.id;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfigurationPublisher() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    private final void updateConfigChanges(Map<String, ? extends Object> map) {
        if (map.isEmpty()) {
            this.configurationsMap.clear();
        } else {
            this.configurationsMap.putAll(map);
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final Map<String, Object> getConfigChanges() {
        return M.m(this.configurationsMap);
    }

    public final void notify(Map<ConfigChange, ? extends Object> configChanges) {
        j.g(configChanges, "configChanges");
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.b(configChanges.size()));
        Iterator<T> it = configChanges.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((ConfigChange) entry.getKey()).getId(), entry.getValue());
        }
        synchronized (this.lock) {
            try {
                updateConfigChanges(linkedHashMap);
                Iterator<ConfigurationSubscriber> it2 = this.subscribers.iterator();
                while (it2.hasNext()) {
                    it2.next().notify(linkedHashMap);
                }
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void register(ConfigurationSubscriber subscriber) {
        j.g(subscriber, "subscriber");
        synchronized (this.lock) {
            try {
                if (this.subscribers.size() < this.maxSubscribers) {
                    this.subscribers.add(subscriber);
                    subscriber.notify(this.configurationsMap);
                } else {
                    Utility.devLog(OneAgentLoggingKt.TAG_START_STOP_AGENT, "There are already " + this.maxSubscribers + " subscribers registered,cannot add another one: Dropping this subscriber.");
                }
                Unit unit = Unit.f18162a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void unregister(ConfigurationSubscriber subscriber) {
        j.g(subscriber, "subscriber");
        synchronized (this.lock) {
            this.subscribers.remove(subscriber);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfigurationPublisher(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    public ConfigurationPublisher(int i, Set<ConfigurationSubscriber> subscribers) {
        j.g(subscribers, "subscribers");
        this.maxSubscribers = i;
        this.subscribers = subscribers;
        this.configurationsMap = new LinkedHashMap();
        this.lock = new Object();
    }

    public /* synthetic */ ConfigurationPublisher(int i, Set set, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 10 : i, (i4 & 2) != 0 ? new LinkedHashSet() : set);
    }
}
