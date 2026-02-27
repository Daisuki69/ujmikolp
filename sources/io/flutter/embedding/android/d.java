package io.flutter.embedding.android;

import android.view.textservice.SpellCheckerInfo;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return FlutterView.lambda$sendUserSettingsToFlutter$0((SpellCheckerInfo) obj);
    }
}
