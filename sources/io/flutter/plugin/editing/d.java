package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.paymaya.domain.store.M;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends BaseInputConnection implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterView f17176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17177b;
    public final TextInputChannel c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f17178d;
    public final EditorInfo e;
    public ExtractedTextRequest f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17179g;
    public CursorAnchorInfo.Builder h;
    public final ExtractedText i;
    public final InputMethodManager j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DynamicLayout f17180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M f17181l;
    public final c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17182n;

    public d(FlutterView flutterView, int i, TextInputChannel textInputChannel, c cVar, g gVar, EditorInfo editorInfo) {
        FlutterJNI flutterJNI = new FlutterJNI();
        super(flutterView, true);
        this.f17179g = false;
        this.i = new ExtractedText();
        this.f17182n = 0;
        this.f17176a = flutterView;
        this.f17177b = i;
        this.c = textInputChannel;
        this.f17178d = gVar;
        gVar.a(this);
        this.e = editorInfo;
        this.m = cVar;
        this.f17181l = new M(flutterJNI, 11);
        this.f17180k = new DynamicLayout(gVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.j = (InputMethodManager) flutterView.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.f
    public final void a(boolean z4) {
        g gVar = this.f17178d;
        gVar.getClass();
        this.j.updateSelection(this.f17176a, Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar), BaseInputConnection.getComposingSpanStart(gVar), BaseInputConnection.getComposingSpanEnd(gVar));
        ExtractedTextRequest extractedTextRequest = this.f;
        InputMethodManager inputMethodManager = this.j;
        FlutterView flutterView = this.f17176a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(flutterView, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f17179g) {
            inputMethodManager.updateCursorAnchorInfo(flutterView, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.h;
        if (builder == null) {
            this.h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.h;
        g gVar = this.f17178d;
        gVar.getClass();
        int selectionStart = Selection.getSelectionStart(gVar);
        gVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(gVar));
        gVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(gVar);
        gVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(gVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.h.setComposingText(-1, "");
        } else {
            this.h.setComposingText(composingSpanStart, gVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f17178d.b();
        this.f17182n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence string = this.f17178d;
        string.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(string);
        string.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(string);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            string = string.toString();
        }
        extractedText.text = string;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f17178d.e(this);
        while (this.f17182n > 0) {
            endBatchEdit();
            this.f17182n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        int i4;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f17176a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i4 = inputStreamOpenInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i4 = -1;
                                    }
                                    if (i4 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap map = new HashMap();
                                        map.put("mimeType", mimeType);
                                        map.put("data", byteArray);
                                        map.put("uri", contentUri.toString());
                                        this.c.commitContent(this.f17177b, map);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i4);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028b, code lost:
    
        r14 = r14 + r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x003f A[ADDED_TO_REGION, EDGE_INSN: B:198:0x003f->B:18:0x003f BREAK  A[LOOP:2: B:63:0x00fe->B:201:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01ad A[ADDED_TO_REGION, EDGE_INSN: B:208:0x01ad->B:108:0x01ad BREAK  A[LOOP:4: B:143:0x0232->B:211:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.d.d(boolean, boolean):boolean");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i4) {
        g gVar = this.f17178d;
        gVar.getClass();
        if (Selection.getSelectionStart(gVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i4);
    }

    public final boolean e(boolean z4, boolean z5) {
        g gVar = this.f17178d;
        int selectionStart = Selection.getSelectionStart(gVar);
        int selectionEnd = Selection.getSelectionEnd(gVar);
        boolean z8 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z5) {
            z8 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f17180k;
        if (z8) {
            if (z4) {
                Selection.moveUp(gVar, dynamicLayout);
            } else {
                Selection.moveDown(gVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(gVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z4) {
                Selection.extendUp(gVar, dynamicLayout);
            } else {
                Selection.extendDown(gVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(gVar), Selection.getSelectionEnd(gVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f17182n--;
        this.f17178d.c();
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f17178d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        this.f = (i & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean z4 = true;
        g gVar = this.f17178d;
        if (i == 16908319) {
            setSelection(0, gVar.length());
        } else {
            FlutterView flutterView = this.f17176a;
            if (i == 16908320) {
                int selectionStart = Selection.getSelectionStart(gVar);
                int selectionEnd = Selection.getSelectionEnd(gVar);
                if (selectionStart != selectionEnd) {
                    int iMin = Math.min(selectionStart, selectionEnd);
                    int iMax = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) flutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(iMin, iMax)));
                    gVar.delete(iMin, iMax);
                    setSelection(iMin, iMin);
                }
            } else if (i == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(gVar);
                int selectionEnd2 = Selection.getSelectionEnd(gVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) flutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", gVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i == 16908322) {
                ClipData primaryClip = ((ClipboardManager) flutterView.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(flutterView.getContext());
                    int iMax2 = Math.max(0, Selection.getSelectionStart(gVar));
                    int iMax3 = Math.max(0, Selection.getSelectionEnd(gVar));
                    int iMin2 = Math.min(iMax2, iMax3);
                    int iMax4 = Math.max(iMax2, iMax3);
                    if (iMin2 != iMax4) {
                        gVar.delete(iMin2, iMax4);
                    }
                    gVar.insert(iMin2, charSequenceCoerceToText);
                    int length = charSequenceCoerceToText.length() + iMin2;
                    setSelection(length, length);
                }
            } else {
                z4 = false;
            }
        }
        endBatchEdit();
        return z4;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i4 = this.f17177b;
        TextInputChannel textInputChannel = this.c;
        if (i == 0) {
            textInputChannel.unspecifiedAction(i4);
        } else if (i == 1) {
            textInputChannel.newline(i4);
        } else if (i == 2) {
            textInputChannel.go(i4);
        } else if (i == 3) {
            textInputChannel.search(i4);
        } else if (i == 4) {
            textInputChannel.send(i4);
        } else if (i == 5) {
            textInputChannel.next(i4);
        } else if (i != 7) {
            textInputChannel.done(i4);
        } else {
            textInputChannel.previous(i4);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        this.c.performPrivateCommand(this.f17177b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        if ((i & 1) != 0) {
            this.j.updateCursorAnchorInfo(this.f17176a, b());
        }
        this.f17179g = (i & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.m.handleEvent(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i4) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i4);
        endBatchEdit();
        return selection;
    }
}
