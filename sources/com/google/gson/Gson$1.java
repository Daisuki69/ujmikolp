package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class Gson$1 extends y {
    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        if (aVar.peek() != 9) {
            return Double.valueOf(aVar.B());
        }
        aVar.G();
        return null;
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.r();
            return;
        }
        double dDoubleValue = number.doubleValue();
        j.a(dDoubleValue);
        bVar.z(dDoubleValue);
    }
}
