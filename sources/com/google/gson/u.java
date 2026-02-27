package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public enum u extends x {
    public u() {
        super("LAZILY_PARSED_NUMBER", 1);
    }

    @Override // com.google.gson.x
    public final Number a(j3.a aVar) {
        return new com.google.gson.internal.g(aVar.I());
    }
}
