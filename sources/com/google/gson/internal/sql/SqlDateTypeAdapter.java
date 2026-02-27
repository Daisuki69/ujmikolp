package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class SqlDateTypeAdapter extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f10004b = new z() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.z
        public final y a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f10005a;

    public /* synthetic */ SqlDateTypeAdapter(int i) {
        this();
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        Date date;
        if (aVar.peek() == 9) {
            aVar.G();
            return null;
        }
        String strI = aVar.I();
        synchronized (this) {
            TimeZone timeZone = this.f10005a.getTimeZone();
            try {
                try {
                    date = new Date(this.f10005a.parse(strI).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strI + "' as SQL Date; at path " + aVar.r(), e);
                }
            } finally {
                this.f10005a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.r();
            return;
        }
        synchronized (this) {
            str = this.f10005a.format((java.util.Date) date);
        }
        bVar.E(str);
    }

    private SqlDateTypeAdapter() {
        this.f10005a = new SimpleDateFormat("MMM d, yyyy");
    }
}
