package androidx.constraintlayout.core.parser;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i4) {
        StringBuilder sb2 = new StringBuilder();
        String json = toJSON();
        if (i4 > 0 || json.length() + i >= CLElement.MAX_LINE) {
            sb2.append("[\n");
            boolean z4 = true;
            for (CLElement cLElement : this.mElements) {
                if (z4) {
                    z4 = false;
                } else {
                    sb2.append(",\n");
                }
                addIndent(sb2, CLElement.BASE_INDENT + i);
                sb2.append(cLElement.toFormattedJSON(CLElement.BASE_INDENT + i, i4 - 1));
            }
            sb2.append(Global.NEWLINE);
            addIndent(sb2, i);
            sb2.append("]");
        } else {
            sb2.append(json);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + "[");
        boolean z4 = true;
        for (int i = 0; i < this.mElements.size(); i++) {
            if (z4) {
                z4 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.mElements.get(i).toJSON());
        }
        return ((Object) sb2) + "]";
    }
}
