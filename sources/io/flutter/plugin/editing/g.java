package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17184a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17185b = 0;
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17186d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17187g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f17189l;

    public g(TextInputChannel.TextEditState textEditState, FlutterView flutterView) {
        this.f17189l = new e(flutterView, this);
        if (textEditState != null) {
            f(textEditState);
        }
    }

    public final void a(f fVar) {
        if (this.f17185b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + fVar.toString() + " in a listener callback");
        }
        if (this.f17184a <= 0) {
            this.c.add(fVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f17186d.add(fVar);
        }
    }

    public final void b() {
        this.f17184a++;
        if (this.f17185b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f17184a != 1 || this.c.isEmpty()) {
            return;
        }
        this.f17187g = toString();
        this.h = Selection.getSelectionStart(this);
        this.i = Selection.getSelectionEnd(this);
        this.j = BaseInputConnection.getComposingSpanStart(this);
        this.f17188k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i = this.f17184a;
        if (i == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.c;
        ArrayList<f> arrayList2 = this.f17186d;
        if (i == 1) {
            for (f fVar : arrayList2) {
                this.f17185b++;
                fVar.a(true);
                this.f17185b--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                d(!toString().equals(this.f17187g), (this.h == Selection.getSelectionStart(this) && this.i == Selection.getSelectionEnd(this)) ? false : true, (this.j == BaseInputConnection.getComposingSpanStart(this) && this.f17188k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f17184a--;
    }

    public final void d(boolean z4, boolean z5, boolean z8) {
        if (z4 || z5 || z8) {
            for (f fVar : this.c) {
                this.f17185b++;
                fVar.a(z4);
                this.f17185b--;
            }
        }
    }

    public final void e(f fVar) {
        if (this.f17185b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + fVar.toString() + " in a listener callback");
        }
        this.c.remove(fVar);
        if (this.f17184a > 0) {
            this.f17186d.remove(fVar);
        }
    }

    public final void f(TextInputChannel.TextEditState textEditState) {
        b();
        replace(0, length(), (CharSequence) textEditState.text);
        if (textEditState.hasSelection()) {
            Selection.setSelection(this, textEditState.selectionStart, textEditState.selectionEnd);
        } else {
            Selection.removeSelection(this);
        }
        int i = textEditState.composingStart;
        int i4 = textEditState.composingEnd;
        if (i < 0 || i >= i4) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f17189l.setComposingRegion(i, i4);
        }
        this.e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i6) {
        super.setSpan(obj, i, i4, i6);
        ArrayList arrayList = this.e;
        String string = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.e = selectionStart;
        iVar.f = selectionEnd;
        iVar.f17196g = composingSpanStart;
        iVar.h = composingSpanEnd;
        iVar.f17193a = string;
        iVar.f17194b = "";
        iVar.c = -1;
        iVar.f17195d = -1;
        arrayList.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i4, CharSequence charSequence, int i6, int i10) {
        if (this.f17185b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i11 = i4 - i;
        boolean z4 = i11 != i10 - i6;
        for (int i12 = 0; i12 < i11 && !z4; i12++) {
            z4 |= charAt(i + i12) != charSequence.charAt(i6 + i12);
        }
        if (z4) {
            this.f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i, i4, charSequence, i6, i10);
        ArrayList arrayList = this.e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.e = selectionStart2;
        iVar.f = selectionEnd2;
        iVar.f17196g = composingSpanStart2;
        iVar.h = composingSpanEnd2;
        String string2 = charSequence.toString();
        iVar.f17193a = string;
        iVar.f17194b = string2;
        iVar.c = i;
        iVar.f17195d = i4;
        arrayList.add(iVar);
        if (this.f17184a > 0) {
            return spannableStringBuilderReplace;
        }
        d(z4, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return spannableStringBuilderReplace;
    }
}
