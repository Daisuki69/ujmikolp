package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class Gson$2 extends y {
    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        if (aVar.peek() != 9) {
            return Float.valueOf((float) aVar.B());
        }
        aVar.G();
        return null;
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            bVar.r();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        j.a(fFloatValue);
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
        }
        bVar.D(numberValueOf);
    }
}
