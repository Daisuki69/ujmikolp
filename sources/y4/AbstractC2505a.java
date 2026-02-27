package y4;

import M8.A0;
import androidx.camera.video.AudioStats;
import com.google.android.material.timepicker.TimeModel;
import com.mastercard.mpqr.pushpayment.exception.InvalidTagValueException;
import com.mastercard.mpqr.pushpayment.exception.LimitException;
import com.mastercard.mpqr.pushpayment.exception.MissingTagException;
import com.mastercard.mpqr.pushpayment.exception.RFUTagException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import x4.InterfaceC2466c;

/* JADX INFO: renamed from: y4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2505a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f21054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2466c[] f21055b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f21056d;

    public AbstractC2505a(Class cls, String str) {
        this.f21054a = null;
        this.c = null;
        this.f21056d = new HashMap();
        this.f21055b = (InterfaceC2466c[]) cls.getEnumConstants();
        if (str.isEmpty()) {
            return;
        }
        this.f21054a = Pattern.compile(str);
    }

    public final void a() throws RFUTagException {
        HashMap map = this.f21056d;
        for (String str : new ArrayList(map.keySet())) {
            Serializable serializable = (Serializable) map.get(str);
            if (serializable instanceof AbstractC2505a) {
                ((AbstractC2505a) serializable).a();
            }
            Pattern pattern = this.f21054a;
            if (pattern != null && pattern.matcher(str).matches()) {
                if (!(this instanceof f)) {
                    throw new RFUTagException(String.format("The sub-tag '%1$s' in root-tag '%2$s' is reserved for use and should not have a value when generating QR", str, this.c));
                }
                throw new RFUTagException(String.format("The tag '%1$s' is reserved for use and should not have a value when generating QR", str));
            }
        }
    }

    public final String b(String str) {
        Serializable serializableD = d(str);
        if (serializableD == null) {
            return null;
        }
        return serializableD.toString();
    }

    public final String c(InterfaceC2466c interfaceC2466c) {
        Serializable serializableE = e(interfaceC2466c);
        if (serializableE == null) {
            return null;
        }
        return serializableE.toString();
    }

    public final Serializable d(String str) {
        A0.t(str);
        str.getClass();
        return (Serializable) this.f21056d.get(str);
    }

    public final Serializable e(InterfaceC2466c interfaceC2466c) {
        String tag = interfaceC2466c.getTag();
        tag.getClass();
        return (Serializable) this.f21056d.get(tag);
    }

    public final boolean f(x4.f fVar) {
        return this.f21056d.containsKey(fVar.f20927a);
    }

    public void g(String str, Serializable serializable) {
        A0.t(str);
        str.getClass();
        this.f21056d.put(str, serializable);
    }

    public final void h(InterfaceC2466c interfaceC2466c, Serializable serializable) {
        String tag = interfaceC2466c.getTag();
        tag.getClass();
        this.f21056d.put(tag, serializable);
    }

    public final void i(C2508d c2508d) throws LimitException {
        HashMap map = this.f21056d;
        for (int i = 27; i < 28; i++) {
            String strValueOf = String.valueOf(i);
            A0.t(strValueOf);
            strValueOf.getClass();
            if (!map.containsKey(strValueOf)) {
                map.put(strValueOf, c2508d);
                return;
            } else {
                if (strValueOf.equals(String.valueOf(27))) {
                    throw new LimitException(String.format("Tag range %1$s-%2$s is full, cannot allocate value '%3$s' to a tag", 27, 27, c2508d.toString()));
                }
            }
        }
    }

    public void j() throws InvalidTagValueException, MissingTagException {
        for (InterfaceC2466c interfaceC2466c : this.f21055b) {
            int i = Integer.parseInt(interfaceC2466c.getTag());
            Serializable serializable = (Serializable) this.f21056d.get(interfaceC2466c.getTag());
            String str = this.c;
            if (serializable != null) {
                if (serializable instanceof AbstractC2505a) {
                    ((AbstractC2505a) serializable).j();
                }
                String strValueOf = String.valueOf(serializable);
                Pattern patternR = interfaceC2466c.r();
                if (patternR == null) {
                    boolean z4 = this instanceof f;
                    if ((!z4 || 1 >= i || i >= 52) && (strValueOf.length() > 99 || strValueOf.length() == 0)) {
                        if (!z4) {
                            throw new InvalidTagValueException(str, interfaceC2466c, strValueOf);
                        }
                        throw new InvalidTagValueException(interfaceC2466c, strValueOf);
                    }
                } else if (!patternR.matcher(strValueOf).matches()) {
                    if (str == null) {
                        throw new InvalidTagValueException(interfaceC2466c, strValueOf);
                    }
                    throw new InvalidTagValueException(str, interfaceC2466c, strValueOf);
                }
            } else if (interfaceC2466c.m()) {
                if (!(this instanceof f)) {
                    throw new MissingTagException(String.format("Mandatory sub-tag(s) %1$s from root-tag '%2$s' are missing", Arrays.toString(new InterfaceC2466c[]{interfaceC2466c}), str));
                }
                throw new MissingTagException(String.format("Mandatory tag(s) %1$s is/are missing", Arrays.toString(new InterfaceC2466c[]{interfaceC2466c})));
            }
        }
    }

    public final String toString() {
        HashMap map = this.f21056d;
        ArrayList<String> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new B9.a(14));
        StringBuilder sb2 = new StringBuilder();
        for (String str : arrayList) {
            boolean z4 = this instanceof f;
            if (!z4 || !str.equals("63")) {
                Serializable serializable = (Serializable) map.get(str);
                Pattern pattern = this.f21054a;
                if (pattern == null || !pattern.matcher(str).matches()) {
                    if (serializable != null && serializable.toString().length() != 0) {
                        String strValueOf = String.valueOf(serializable);
                        if (z4 && ((str.equals("54") || str.equals("56")) && Double.valueOf(strValueOf).doubleValue() != AudioStats.AUDIO_AMPLITUDE_NONE)) {
                            while (strValueOf.substring(0, 1).equalsIgnoreCase("0") && strValueOf.length() > 1) {
                                strValueOf = strValueOf.substring(1);
                            }
                            if (strValueOf.substring(0, 1).equalsIgnoreCase(".")) {
                                strValueOf = "0".concat(strValueOf);
                            }
                        }
                        sb2.append(str);
                        sb2.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(strValueOf.length())));
                        sb2.append(strValueOf);
                    }
                }
            }
        }
        if ((this instanceof f) && map.get("63") != null) {
            sb2.append("6304".concat(String.valueOf(map.get("63"))));
        }
        return sb2.toString();
    }

    public AbstractC2505a(Class cls, String str, String str2) {
        this(cls, str);
        this.c = str2;
    }
}
