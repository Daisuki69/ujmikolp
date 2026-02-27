package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f10008b = new z() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.z
        public final y a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(jVar.h(Date.class));
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f10009a;

    public SqlTimestampTypeAdapter(y yVar) {
        this.f10009a = yVar;
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        Date date = (Date) this.f10009a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) {
        this.f10009a.write(bVar, (Timestamp) obj);
    }
}
