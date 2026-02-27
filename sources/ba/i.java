package ba;

import com.paymaya.domain.model.Biller;
import dOYHB6.tiZVw8.numX49;
import ej.C1449a;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String upperCase;
        String strMName = ((Biller) obj).mName();
        String strTnTj78 = numX49.tnTj78("bucK");
        String strTnTj782 = numX49.tnTj78("bucw");
        String strTnTj783 = numX49.tnTj78("bucc");
        if (strMName != null) {
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.j.f(locale, strTnTj783);
            upperCase = strMName.toUpperCase(locale);
            kotlin.jvm.internal.j.f(upperCase, strTnTj782);
        } else {
            upperCase = strTnTj78;
        }
        String strMName2 = ((Biller) obj2).mName();
        if (strMName2 != null) {
            Locale locale2 = Locale.getDefault();
            kotlin.jvm.internal.j.f(locale2, strTnTj783);
            strTnTj78 = strMName2.toUpperCase(locale2);
            kotlin.jvm.internal.j.f(strTnTj78, strTnTj782);
        }
        return C1449a.a(upperCase, strTnTj78);
    }
}
