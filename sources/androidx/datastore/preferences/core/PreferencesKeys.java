package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesKeys {
    public static final Preferences.Key<Boolean> booleanKey(String name) {
        j.g(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<byte[]> byteArrayKey(String name) {
        j.g(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Double> doubleKey(String name) {
        j.g(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Float> floatKey(String name) {
        j.g(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Integer> intKey(String name) {
        j.g(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Long> longKey(String name) {
        j.g(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<String> stringKey(String name) {
        j.g(name, "name");
        return new Preferences.Key<>(name);
    }

    public static final Preferences.Key<Set<String>> stringSetKey(String name) {
        j.g(name, "name");
        return new Preferences.Key<>(name);
    }
}
