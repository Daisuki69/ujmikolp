package G5;

import Bj.C0149k;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.widget.EditText;
import androidx.camera.video.AudioStats;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1132s;
import com.dynatrace.android.agent.Global;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;
import zj.C2576A;
import zj.C2578C;

/* JADX INFO: renamed from: G5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0256f implements TextWatcher {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Locale f1733q = Locale.ENGLISH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f1734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DecimalFormatSymbols f1735b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1736d;
    public final InterfaceC1033d e;
    public final InterfaceC1033d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1033d f1737g;
    public boolean h;
    public IntRange i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f1738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double f1739l;
    public InterfaceC0254d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f1740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f1741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1742p;

    public C0256f(EditText editText) {
        kotlin.jvm.internal.j.g(editText, "editText");
        this.f1734a = editText;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(f1733q);
        this.f1735b = decimalFormatSymbols;
        this.c = String.valueOf(decimalFormatSymbols.getGroupingSeparator());
        this.f1736d = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
        final int i = 0;
        this.e = C1034e.b(new Function0(this) { // from class: G5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0256f f1728b;

            {
                this.f1728b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DecimalFormat decimalFormat = new DecimalFormat("###,##0.##", this.f1728b.f1735b);
                        decimalFormat.setDecimalSeparatorAlwaysShown(true);
                        decimalFormat.setRoundingMode(RoundingMode.DOWN);
                        decimalFormat.setParseBigDecimal(true);
                        return decimalFormat;
                    case 1:
                        return new DecimalFormat("###,##0", this.f1728b.f1735b);
                    default:
                        return new DecimalFormat("###,##0.00", this.f1728b.f1735b);
                }
            }
        });
        final int i4 = 1;
        this.f = C1034e.b(new Function0(this) { // from class: G5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0256f f1728b;

            {
                this.f1728b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        DecimalFormat decimalFormat = new DecimalFormat("###,##0.##", this.f1728b.f1735b);
                        decimalFormat.setDecimalSeparatorAlwaysShown(true);
                        decimalFormat.setRoundingMode(RoundingMode.DOWN);
                        decimalFormat.setParseBigDecimal(true);
                        return decimalFormat;
                    case 1:
                        return new DecimalFormat("###,##0", this.f1728b.f1735b);
                    default:
                        return new DecimalFormat("###,##0.00", this.f1728b.f1735b);
                }
            }
        });
        final int i6 = 2;
        this.f1737g = C1034e.b(new Function0(this) { // from class: G5.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0256f f1728b;

            {
                this.f1728b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        DecimalFormat decimalFormat = new DecimalFormat("###,##0.##", this.f1728b.f1735b);
                        decimalFormat.setDecimalSeparatorAlwaysShown(true);
                        decimalFormat.setRoundingMode(RoundingMode.DOWN);
                        decimalFormat.setParseBigDecimal(true);
                        return decimalFormat;
                    case 1:
                        return new DecimalFormat("###,##0", this.f1728b.f1735b);
                    default:
                        return new DecimalFormat("###,##0.00", this.f1728b.f1735b);
                }
            }
        });
        this.f1740n = "0";
        this.f1741o = "PHP";
        this.f1742p = 1;
        editText.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        editText.setCursorVisible(true);
        editText.setAccessibilityDelegate(new C0255e(editText, new C0149k(this, 1)));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0253c(this, 0));
    }

    public final void a() {
        EditText editText = this.f1734a;
        String strC = c(editText.getText().toString());
        try {
            DecimalFormat decimalFormat = C2576A.z(strC, this.f1736d, false, 2) ? (DecimalFormat) this.f1737g.getValue() : (DecimalFormat) this.f.getValue();
            String strB = b(decimalFormat.format(decimalFormat.parse(strC)));
            editText.setText(strB);
            editText.setSelection(strB.length());
        } catch (ParseException unused) {
            String strB2 = b(this.f1740n);
            editText.setText(strB2);
            editText.setSelection(strB2.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s9) {
        String string;
        Number number;
        String string2;
        Number number2;
        String string3;
        String str = this.f1736d;
        kotlin.jvm.internal.j.g(s9, "s");
        EditText editText = this.f1734a;
        editText.removeTextChangedListener(this);
        String strC = c(this.j);
        int length = this.f1741o.length() + this.f1742p;
        if (C2576A.H(strC)) {
            String strB = b(this.f1740n);
            editText.setText(strB);
            editText.setSelection(strB.length());
            e(AudioStats.AUDIO_AMPLITUDE_NONE);
            editText.addTextChangedListener(this);
            return;
        }
        int selectionStart = editText.getSelectionStart();
        try {
            int length2 = editText.getText().length();
            if (strC.equals(str) && strC.length() == 1) {
                strC = "0" + str;
            }
            InterfaceC1033d interfaceC1033d = this.e;
            Number number3 = ((DecimalFormat) interfaceC1033d.getValue()).parse(strC);
            boolean z4 = this.h;
            InterfaceC1033d interfaceC1033d2 = this.f;
            if (z4) {
                List listT = C2576A.T(strC, new String[]{str}, 6);
                String strSubstring = (String) listT.get(0);
                String strSubstring2 = (String) listT.get(1);
                if (strSubstring.length() > 0 && C2578C.c0(strSubstring) == '0' && (number2 = ((DecimalFormat) interfaceC1033d2.getValue()).parse(strSubstring)) != null && (string3 = number2.toString()) != null) {
                    strSubstring = string3;
                }
                if (strSubstring.length() > 7) {
                    strSubstring = strSubstring.substring(0, 7);
                    kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                }
                if (strSubstring2.length() > 2) {
                    strSubstring2 = strSubstring2.substring(0, 2);
                    kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                }
                String str2 = strSubstring + str + strSubstring2;
                Number number4 = ((DecimalFormat) interfaceC1033d.getValue()).parse(str2);
                int i = 0;
                for (int length3 = str2.length() - 1; -1 < length3 && str2.charAt(length3) == '0'; length3--) {
                    i++;
                }
                StringBuilder sb2 = new StringBuilder(((DecimalFormat) interfaceC1033d.getValue()).format(number4));
                while (true) {
                    int i4 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    sb2.append('0');
                    i = i4;
                }
                string = sb2.toString();
            } else {
                if (strC.length() > 0 && C2578C.c0(strC) == '0' && (number = ((DecimalFormat) interfaceC1033d2.getValue()).parse(strC)) != null && (string2 = number.toString()) != null) {
                    strC = string2;
                }
                if (strC.length() > 7) {
                    strC = strC.substring(0, 7);
                    kotlin.jvm.internal.j.f(strC, "substring(...)");
                }
                string = ((DecimalFormat) interfaceC1033d2.getValue()).format(((DecimalFormat) interfaceC1033d.getValue()).parse(strC));
            }
            String strB2 = b(string);
            if (s9.length() < length || !zj.z.w(s9.toString(), 2, b(null), false)) {
                editText.setText(strB2);
            } else {
                s9.replace(length, s9.length(), strB2);
            }
            e(number3 != null ? number3.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE);
            d(selectionStart, length2, strB2.length());
        } catch (NumberFormatException | ParseException unused) {
        }
        editText.addTextChangedListener(this);
    }

    public final String b(String str) {
        int size;
        String str2 = this.f1741o;
        Iterable intRange = new IntRange(1, this.f1742p, 1);
        if (intRange instanceof Collection) {
            size = ((Collection) intRange).size();
        } else {
            Iterator<Integer> it = intRange.iterator();
            int i = 0;
            while (((wj.e) it).c) {
                it.next();
                i++;
                if (i < 0) {
                    C1132s.j();
                    throw null;
                }
            }
            size = i;
        }
        String str3 = "";
        for (int i4 = 0; i4 < size; i4++) {
            str3 = ((Object) str3) + Global.BLANK;
        }
        if (str == null) {
            str = "";
        }
        return androidx.camera.core.impl.a.j(str2, str3, str);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s9, int i, int i4, int i6) {
        kotlin.jvm.internal.j.g(s9, "s");
        String strSubstring = s9.toString().substring(i, i4 + i);
        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        if (strSubstring.equals(this.c)) {
            this.i = new IntRange(i - 1, i, 1);
        }
    }

    public final String c(String str) {
        return str != null ? zj.z.t(zj.z.t(zj.z.t(str, this.c, ""), this.f1741o, ""), Global.BLANK, "") : "";
    }

    public final void d(int i, int i4, int i6) {
        int length = this.f1741o.length() + this.f1742p;
        int i10 = (i6 - i4) + i;
        EditText editText = this.f1734a;
        if (length >= i10) {
            editText.setSelection(length);
        } else if (i10 <= 0 || i10 > editText.getText().length()) {
            editText.setSelection(editText.getText().length() - 1);
        } else {
            editText.setSelection(i10);
        }
    }

    public final void e(double d10) {
        if (this.m != null) {
            double d11 = this.f1738k;
            if (d11 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                if (Double.compare(d10, d11) > 0 || Double.compare(d10, this.f1739l) < 0) {
                    InterfaceC0254d interfaceC0254d = this.m;
                    if (interfaceC0254d != null) {
                        interfaceC0254d.T();
                        return;
                    }
                    return;
                }
                InterfaceC0254d interfaceC0254d2 = this.m;
                if (interfaceC0254d2 != null) {
                    interfaceC0254d2.u();
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s9, int i, int i4, int i6) {
        kotlin.jvm.internal.j.g(s9, "s");
        StringBuilder sb2 = new StringBuilder(s9.toString());
        IntRange intRange = this.i;
        if (intRange != null) {
            sb2.delete(intRange.f18201a, intRange != null ? intRange.f18202b : 0);
            this.i = null;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        String string2 = C2576A.b0(string).toString();
        this.j = string2;
        this.h = string2 != null ? C2576A.z(string2, this.f1736d, false, 2) : false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0256f(EditText editText, double d10, double d11) {
        this(editText);
        kotlin.jvm.internal.j.g(editText, "editText");
        this.f1739l = d10;
        this.f1738k = d11;
    }
}
