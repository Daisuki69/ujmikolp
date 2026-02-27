package com.tencent.could.huiyansdk.manager;

import android.content.Context;
import android.content.res.Configuration;
import com.tencent.could.huiyansdk.manager.e;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f15679a = new c();
    }

    public final Context a(Context context, Locale locale) {
        if (context == null) {
            e.a.f15688a.a(2, "LanguageManager", "update locale, but context is null.");
            return null;
        }
        e.a.f15688a.a(1, "LanguageManager", "country: " + locale.getCountry() + " language: " + locale.getLanguage());
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }
}
