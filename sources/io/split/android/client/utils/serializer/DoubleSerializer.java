package io.split.android.client.utils.serializer;

import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.s;

/* JADX INFO: loaded from: classes4.dex */
public class DoubleSerializer implements s {
    @Override // com.google.gson.s
    public final o a(Object obj) {
        Double d10 = (Double) obj;
        return d10.doubleValue() == ((double) d10.longValue()) ? new r(Long.valueOf(d10.longValue())) : new r(d10);
    }
}
