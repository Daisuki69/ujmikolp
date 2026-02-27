package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.embedding.android.FlutterView;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends BaseInputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f17183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FlutterView flutterView, g gVar) {
        super(flutterView, true);
        this.f17183a = gVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f17183a;
    }
}
