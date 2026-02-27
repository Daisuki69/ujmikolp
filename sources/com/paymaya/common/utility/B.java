package com.paymaya.common.utility;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayList;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements Html.TagHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10372a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10373b = 1;

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z4, String str, Editable editable, XMLReader xMLReader) {
        boolean zEquals = "ul".equals(str);
        ArrayList arrayList = this.f10372a;
        if (zEquals || "ol".equals(str)) {
            if (z4) {
                arrayList.add(str);
            } else {
                if (arrayList.size() > 0) {
                    arrayList.remove(arrayList.size() - 1);
                }
                this.f10373b = 1;
            }
        }
        if (("li".equals(str) || "listItem".equals(str)) && z4) {
            if (arrayList.size() > 0 && "ul".equals(arrayList.get(arrayList.size() - 1))) {
                editable.append("• ");
                return;
            }
            editable.append((CharSequence) (this.f10373b + ". "));
            this.f10373b = this.f10373b + 1;
        }
    }
}
