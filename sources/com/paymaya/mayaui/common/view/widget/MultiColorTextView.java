package com.paymaya.mayaui.common.view.widget;

import W4.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import of.p;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiColorTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiColorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f6302r);
        String string = getText().toString();
        int color = ContextCompat.getColor(context, typedArrayObtainStyledAttributes.getResourceId(1, getCurrentTextColor()));
        String string2 = typedArrayObtainStyledAttributes.getString(0);
        String string3 = typedArrayObtainStyledAttributes.getString(2);
        if (string2 != null && !C2576A.H(string2) && AbstractC1213b.U("[0-9,]+", string2)) {
            List listT = C2576A.T(string2, new String[]{","}, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listT) {
                if (!C2576A.H((String) obj)) {
                    arrayList.add(obj);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText().toString());
            p.l(2, 2);
            int size = arrayList.size();
            ArrayList<List> arrayList2 = new ArrayList((size / 2) + (size % 2 == 0 ? 0 : 1));
            for (int i = 0; i >= 0 && i < size; i += 2) {
                int i4 = size - i;
                i4 = 2 <= i4 ? 2 : i4;
                ArrayList arrayList3 = new ArrayList(i4);
                for (int i6 = 0; i6 < i4; i6++) {
                    arrayList3.add(arrayList.get(i6 + i));
                }
                arrayList2.add(arrayList3);
            }
            for (List list : arrayList2) {
                int i10 = Integer.parseInt((String) list.get(0));
                int i11 = list.size() == 2 ? Integer.parseInt((String) list.get(1)) : string.length();
                if (i10 < i11 && i10 < string.length() && i11 <= string.length()) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(color), i10, i11, 17);
                }
            }
            setText(spannableStringBuilder);
        } else if (string3 != null && !C2576A.H(string3) && C2576A.z(getText().toString(), string3, false, 2)) {
            a(color, string, string3);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(int i, String baseTextString, String secondaryHighlightSpan) {
        j.g(baseTextString, "baseTextString");
        j.g(secondaryHighlightSpan, "secondaryHighlightSpan");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(baseTextString);
        int iF = C2576A.F(baseTextString, secondaryHighlightSpan, 0, false, 6);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getCurrentTextColor()), 0, iF, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), iF, secondaryHighlightSpan.length() + iF, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getCurrentTextColor()), secondaryHighlightSpan.length() + iF, baseTextString.length(), 17);
        setText(spannableStringBuilder);
    }
}
