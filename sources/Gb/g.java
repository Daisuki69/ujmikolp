package Gb;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1947a;

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i4, Spanned spanned, int i6, int i10) {
        switch (this.f1947a) {
            case 0:
                kotlin.jvm.internal.j.g(source, "source");
                while (i < i4) {
                    if (!Pattern.compile("[1234567890]*").matcher(String.valueOf(source.charAt(i))).matches()) {
                        return "";
                    }
                    i++;
                }
                return null;
            case 1:
                break;
            default:
                if (source.length() <= 0 || spanned.length() < 10) {
                    return null;
                }
                return "";
        }
        while (i < i4) {
            int type = Character.getType(source.charAt(i));
            if (type == 19 || type == 6 || type == 28) {
                return "";
            }
            i++;
        }
        return null;
    }
}
