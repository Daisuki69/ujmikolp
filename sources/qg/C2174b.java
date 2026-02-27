package qg;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.dynatrace.android.agent.Global;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: qg.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2174b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalizationChannel f19785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f19786b;

    public C2174b(Context context, LocalizationChannel localizationChannel) {
        C2173a c2173a = new C2173a(this);
        this.f19786b = context;
        this.f19785a = localizationChannel;
        localizationChannel.setLocalizationMessageHandler(c2173a);
    }

    public static Locale a(String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split(Global.HYPHEN, -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i = 2;
        }
        if (strArrSplit.length > i && strArrSplit[i].length() >= 2 && strArrSplit[i].length() <= 3) {
            str4 = strArrSplit[i];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(locales.get(i));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f19785a.sendLocales(arrayList);
    }
}
