package zj;

import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class s extends r {
    public static String b(String str) {
        List listC;
        int length;
        kotlin.jvm.internal.j.g(str, "<this>");
        j jVar = new j(str);
        if (jVar.hasNext()) {
            Object next = jVar.next();
            if (jVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (jVar.hasNext()) {
                    arrayList.add(jVar.next());
                }
                listC = arrayList;
            } else {
                listC = cj.r.c(next);
            }
        } else {
            listC = C1112C.f9377a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listC) {
            if (!C2576A.H((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(cj.t.l(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!C2579a.b(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Integer num = (Integer) C1110A.J(arrayList3);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listC.size();
        int iF = C1132s.f(listC);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = listC.iterator();
        while (true) {
            String strSubstring = null;
            if (!it2.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length3);
                C1110A.E(arrayList4, sb2, Global.NEWLINE, null, 124);
                return sb2.toString();
            }
            Object next2 = it2.next();
            int i = length + 1;
            if (length < 0) {
                C1132s.k();
                throw null;
            }
            String str3 = (String) next2;
            if ((length != 0 && length != iF) || !C2576A.H(str3)) {
                kotlin.jvm.internal.j.g(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(We.s.g(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            length = i;
        }
    }

    public static String c(String str) {
        List listC;
        kotlin.jvm.internal.j.g(str, "<this>");
        if (C2576A.H("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        j jVar = new j(str);
        if (jVar.hasNext()) {
            Object next = jVar.next();
            if (jVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (jVar.hasNext()) {
                    arrayList.add(jVar.next());
                }
                listC = arrayList;
            } else {
                listC = cj.r.c(next);
            }
        } else {
            listC = C1112C.f9377a;
        }
        int length = str.length();
        listC.size();
        int iF = C1132s.f(listC);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listC.iterator();
        int i = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                C1110A.E(arrayList2, sb2, Global.NEWLINE, null, 124);
                return sb2.toString();
            }
            Object next2 = it.next();
            int i4 = i + 1;
            if (i < 0) {
                C1132s.k();
                throw null;
            }
            String str2 = (String) next2;
            if ((i != 0 && i != iF) || !C2576A.H(str2)) {
                int length2 = str2.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i6 = -1;
                        break;
                    }
                    if (!C2579a.b(str2.charAt(i6))) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1 && z.u(str2, i6, "|", false)) {
                    strSubstring = str2.substring("|".length() + i6);
                    kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i = i4;
        }
    }
}
