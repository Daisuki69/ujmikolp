package Bj;

import G5.C0256f;
import android.widget.EditText;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import com.squareup.wire.MessageJsonAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Bj.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0149k implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f626b;

    public /* synthetic */ C0149k(Object obj, int i) {
        this.f625a = i;
        this.f626b = obj;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f625a) {
            case 0:
                ((Function1) this.f626b).invoke((Throwable) obj);
                return Unit.f18162a;
            case 1:
                EditText editText = (EditText) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.j.g(editText, "editText");
                C0256f c0256f = (C0256f) this.f626b;
                int length = c0256f.f1741o.length() + c0256f.f1742p;
                if (length <= iIntValue) {
                    if (length > iIntValue2) {
                        try {
                            editText.setSelection(iIntValue, length);
                        } catch (IndexOutOfBoundsException unused) {
                            editText.setText(c0256f.b(""));
                        }
                    }
                    break;
                } else {
                    try {
                        editText.setSelection(length, iIntValue2);
                    } catch (IndexOutOfBoundsException unused2) {
                        editText.setText(c0256f.b(""));
                    }
                    break;
                }
                return Unit.f18162a;
            case 2:
                ((Kj.h) this.f626b).b();
                return Unit.f18162a;
            default:
                return MessageJsonAdapter.toJson$lambda$1((JsonWriter) this.f626b, (String) obj, obj2, (JsonAdapter) obj3);
        }
    }
}
