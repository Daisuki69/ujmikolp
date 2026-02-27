package io.flutter.embedding.android;

import android.view.autofill.AutofillValue;
import java.lang.invoke.MethodHandles;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ AutofillValue d(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup l(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    public static /* synthetic */ Locale.LanguageRange n(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void p() {
    }
}
