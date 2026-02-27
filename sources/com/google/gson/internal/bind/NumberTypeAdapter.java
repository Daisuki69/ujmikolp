package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import com.google.gson.z;
import d4.AbstractC1331a;
import java.io.IOException;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberTypeAdapter extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f9903b = a(x.f10037b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f9904a;

    public NumberTypeAdapter(x xVar) {
        this.f9904a = xVar;
    }

    public static z a(x xVar) {
        return new z() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.z
            public final y a(j jVar, TypeToken typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        int iPeek = aVar.peek();
        int iC = AbstractC2217b.c(iPeek);
        if (iC == 5 || iC == 6) {
            return this.f9904a.a(aVar);
        }
        if (iC == 8) {
            aVar.G();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + AbstractC1331a.x(iPeek) + "; at path " + aVar.getPath());
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        bVar.D((Number) obj);
    }
}
