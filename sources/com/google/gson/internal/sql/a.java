package com.google.gson.internal.sql;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends com.google.gson.internal.bind.b {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Class cls, int i) {
        super(cls);
        this.c = i;
    }

    @Override // com.google.gson.internal.bind.b
    public final Date b(Date date) {
        switch (this.c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
