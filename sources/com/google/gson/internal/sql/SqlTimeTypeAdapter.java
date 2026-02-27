package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f10006b = new z() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.z
        public final y a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f10007a;

    public /* synthetic */ SqlTimeTypeAdapter(int i) {
        this();
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        Time time;
        if (aVar.peek() == 9) {
            aVar.G();
            return null;
        }
        String strI = aVar.I();
        synchronized (this) {
            TimeZone timeZone = this.f10007a.getTimeZone();
            try {
                try {
                    time = new Time(this.f10007a.parse(strI).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strI + "' as SQL Time; at path " + aVar.r(), e);
                }
            } finally {
                this.f10007a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.r();
            return;
        }
        synchronized (this) {
            str = this.f10007a.format((Date) time);
        }
        bVar.E(str);
    }

    private SqlTimeTypeAdapter() {
        this.f10007a = new SimpleDateFormat("hh:mm:ss a");
    }
}
