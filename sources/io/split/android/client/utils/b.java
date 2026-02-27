package io.split.android.client.utils;

import androidx.camera.video.AudioStats;
import com.google.gson.j;
import com.google.gson.k;
import io.split.android.client.dtos.KeyImpression;
import io.split.android.client.service.impressions.KeyImpressionSerializer;
import io.split.android.client.utils.serializer.DoubleSerializer;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f17635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile j f17636b;

    static {
        k kVar = new k();
        kVar.f10026g = true;
        kVar.b(new DoubleSerializer(), Double.class);
        kVar.b(new KeyImpressionSerializer(), KeyImpression.class);
        f17635a = kVar.a();
    }

    public static Map a(String str, Type type) {
        Map map = (Map) f17635a.f(str, type);
        for (Map.Entry entry : map.entrySet()) {
            if ((entry.getValue() instanceof Double) && ((Double) entry.getValue()).doubleValue() % 1.0d == AudioStats.AUDIO_AMPLITUDE_NONE) {
                entry.setValue(Integer.valueOf(((Double) entry.getValue()).intValue()));
            }
        }
        return map;
    }

    public static String b(Object obj) {
        if (f17636b == null) {
            synchronized (b.class) {
                try {
                    if (f17636b == null) {
                        k kVar = new k();
                        kVar.b(new DoubleSerializer(), Double.class);
                        f17636b = kVar.a();
                    }
                } finally {
                }
            }
        }
        return f17636b.k(obj);
    }
}
