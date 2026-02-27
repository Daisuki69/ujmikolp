package androidx.constraintlayout.core.parser;

import We.s;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes.dex */
public class CLElement {
    protected static int BASE_INDENT = 2;
    protected static int MAX_LINE = 80;
    private int line;
    protected CLContainer mContainer;
    private final char[] mContent;
    protected long start = -1;
    protected long end = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    public void addIndent(StringBuilder sb2, int i) {
        for (int i4 = 0; i4 < i; i4++) {
            sb2.append(' ');
        }
    }

    public String content() {
        String str = new String(this.mContent);
        long j = this.end;
        if (j != Long.MAX_VALUE) {
            long j6 = this.start;
            if (j >= j6) {
                return str.substring((int) j6, ((int) j) + 1);
            }
        }
        long j7 = this.start;
        return str.substring((int) j7, ((int) j7) + 1);
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public String getDebugName() {
        if (!CLParser.DEBUG) {
            return "";
        }
        return getStrClass() + " -> ";
    }

    public long getEnd() {
        return this.end;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.line;
    }

    public long getStart() {
        return this.start;
    }

    public String getStrClass() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean isDone() {
        return this.end != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.start > -1;
    }

    public boolean notStarted() {
        return this.start == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j) {
        if (this.end != Long.MAX_VALUE) {
            return;
        }
        this.end = j;
        if (CLParser.DEBUG) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i) {
        this.line = i;
    }

    public void setStart(long j) {
        this.start = j;
    }

    public String toFormattedJSON(int i, int i4) {
        return "";
    }

    public String toJSON() {
        return "";
    }

    public String toString() {
        long j = this.start;
        long j6 = this.end;
        if (j > j6 || j6 == Long.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass());
            sb2.append(" (INVALID, ");
            sb2.append(this.start);
            sb2.append(Global.HYPHEN);
            return s.h(this.end, ")", sb2);
        }
        return getStrClass() + " (" + this.start + " : " + this.end + ") <<" + new String(this.mContent).substring((int) this.start, ((int) this.end) + 1) + ">>";
    }
}
