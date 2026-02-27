package com.google.gson.internal.bind;

import We.s;
import com.dynatrace.android.agent.Global;
import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import h3.AbstractC1536a;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends y {
    public static final z c = new z() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.z
        public final y a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DefaultDateTypeAdapter(b.f9936b, 2, 2);
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9891b;

    public DefaultDateTypeAdapter(b bVar, int i, int i4) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f9891b = arrayList;
        Objects.requireNonNull(bVar);
        this.f9890a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i4, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i4));
        }
        if (com.google.gson.internal.f.f9981a >= 9) {
            StringBuilder sb2 = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(s.f(i, "Unknown DateFormat style: "));
                }
                str = "M/d/yy";
            }
            sb2.append(str);
            sb2.append(Global.BLANK);
            if (i4 == 0 || i4 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i4 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i4 != 3) {
                    throw new IllegalArgumentException(s.f(i4, "Unknown DateFormat style: "));
                }
                str2 = "h:mm a";
            }
            sb2.append(str2);
            arrayList.add(new SimpleDateFormat(sb2.toString(), locale));
        }
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        Date dateB;
        if (aVar.peek() == 9) {
            aVar.G();
            return null;
        }
        String strI = aVar.I();
        synchronized (this.f9891b) {
            try {
                Iterator it = this.f9891b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = AbstractC1536a.b(strI, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbW = s.w("Failed parsing '", strI, "' as Date; at path ");
                            sbW.append(aVar.r());
                            throw new JsonSyntaxException(sbW.toString(), e);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strI);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f9890a.b(dateB);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f9891b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.r();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f9891b.get(0);
        synchronized (this.f9891b) {
            str = dateFormat.format(date);
        }
        bVar.E(str);
    }
}
