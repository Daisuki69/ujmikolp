package androidx.room;

import We.s;
import androidx.annotation.RestrictTo;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import cj.I;
import cj.P;
import cj.r;
import cj.t;
import cj.x;
import dj.C1404b;
import dj.C1406d;
import dj.C1413k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import kotlin.ranges.IntRange;
import qj.n;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    public static final class Match {
        private final List<Integer> resultIndices;
        private final IntRange resultRange;

        public Match(IntRange resultRange, List<Integer> resultIndices) {
            j.g(resultRange, "resultRange");
            j.g(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        public final IntRange getResultRange() {
            return this.resultRange;
        }
    }

    public static final class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String name, int i) {
            j.g(name, "name");
            this.name = name;
            this.index = i;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i4 & 2) != 0) {
                i = resultColumn.index;
            }
            return resultColumn.copy(str, i);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        public final ResultColumn copy(String name, int i) {
            j.g(name, "name");
            return new ResultColumn(name, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            return j.b(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.index;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ResultColumn(name=");
            sb2.append(this.name);
            sb2.append(", index=");
            return s.m(sb2, this.index, ')');
        }
    }

    public static final class Solution implements Comparable<Solution> {
        public static final Companion Companion = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(C1112C.f9377a, Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Solution build(List<Match> matches) {
                j.g(matches, "matches");
                List<Match> list = matches;
                int i = 0;
                int size = 0;
                for (Match match : list) {
                    size += ((match.getResultRange().f18202b - match.getResultRange().f18201a) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int i4 = ((Match) it.next()).getResultRange().f18201a;
                while (it.hasNext()) {
                    int i6 = ((Match) it.next()).getResultRange().f18201a;
                    if (i4 > i6) {
                        i4 = i6;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = ((Match) it2.next()).getResultRange().f18202b;
                while (it2.hasNext()) {
                    int i11 = ((Match) it2.next()).getResultRange().f18202b;
                    if (i10 < i11) {
                        i10 = i11;
                    }
                }
                Iterable intRange = new IntRange(i4, i10, 1);
                if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                    Iterator it3 = intRange.iterator();
                    int i12 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((I) it3).nextInt();
                        Iterator<T> it4 = list.iterator();
                        int i13 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().a(iNextInt)) {
                                i13++;
                            }
                            if (i13 > 1) {
                                i12++;
                                if (i12 < 0) {
                                    C1132s.j();
                                    throw null;
                                }
                            }
                        }
                    }
                    i = i12;
                }
                return new Solution(matches, size, i);
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            private Companion() {
            }
        }

        public Solution(List<Match> matches, int i, int i4) {
            j.g(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i;
            this.overlaps = i4;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution other) {
            j.g(other, "other");
            int i = j.i(this.overlaps, other.overlaps);
            return i != 0 ? i : j.i(this.coverageOffset, other.coverageOffset);
        }
    }

    /* JADX INFO: renamed from: androidx.room.AmbiguousColumnResolver$resolve$4, reason: invalid class name */
    public static final class AnonymousClass4 extends k implements Function1<List<? extends Match>, Unit> {
        final /* synthetic */ y $bestSolution;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(y yVar) {
            super(1);
            this.$bestSolution = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<Match>) obj);
            return Unit.f18162a;
        }

        public final void invoke(List<Match> it) {
            j.g(it, "it");
            Solution solutionBuild = Solution.Companion.build(it);
            if (solutionBuild.compareTo((Solution) this.$bestSolution.f18195a) < 0) {
                this.$bestSolution.f18195a = solutionBuild;
            }
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i, Function1<? super List<? extends T>, Unit> function1) {
        if (i == list.size()) {
            function1.invoke(C1110A.V(list2));
            return;
        }
        Iterator<T> it = list.get(i).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i + 1, function1);
            x.t(list2);
        }
    }

    public static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i, Function1 function1, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i4 & 4) != 0) {
            i = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i, function1);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, n nVar) {
        int i = 0;
        int iHashCode = 0;
        for (String str : strArr) {
            iHashCode += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                nVar.invoke(Integer.valueOf(i), Integer.valueOf(length), list.subList(i, length));
            }
            int i4 = i + 1;
            int i6 = length + 1;
            if (i6 > list.size()) {
                return;
            }
            iHashCode2 = (iHashCode2 - list.get(i).getName().hashCode()) + list.get(length).getName().hashCode();
            i = i4;
            length = i6;
        }
    }

    public static final int[][] resolve(String[] resultColumns, String[][] mappings) {
        j.g(resultColumns, "resultColumns");
        j.g(mappings, "mappings");
        int length = resultColumns.length;
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            String strSubstring = resultColumns[i4];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            j.f(US, "US");
            String lowerCase = strSubstring.toLowerCase(US);
            j.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i4] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i6 = 0; i6 < length2; i6++) {
            int length3 = mappings[i6].length;
            for (int i10 = 0; i10 < length3; i10++) {
                String[] strArr = mappings[i6];
                String str = strArr[i10];
                Locale US2 = Locale.US;
                j.f(US2, "US");
                String lowerCase2 = str.toLowerCase(US2);
                j.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr[i10] = lowerCase2;
            }
        }
        C1413k c1413k = new C1413k();
        for (String[] strArr2 : mappings) {
            x.q(c1413k, strArr2);
        }
        C1413k c1413kA = P.a(c1413k);
        C1406d c1406dB = r.b();
        int length4 = resultColumns.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length4) {
            String str2 = resultColumns[i11];
            int i13 = i12 + 1;
            if (c1413kA.f16537a.containsKey(str2)) {
                c1406dB.add(new ResultColumn(str2, i12));
            }
            i11++;
            i12 = i13;
        }
        C1406d c1406dA = r.a(c1406dB);
        int length5 = mappings.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i14 = 0; i14 < length5; i14++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length6) {
            String[] strArr3 = mappings[i15];
            int i17 = i16 + 1;
            INSTANCE.rabinKarpSearch(c1406dA, strArr3, new AmbiguousColumnResolver$resolve$1$1(strArr3, arrayList, i16));
            if (((List) arrayList.get(i16)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                int i18 = i;
                while (i18 < length7) {
                    String str3 = strArr3[i18];
                    C1406d c1406dB2 = r.b();
                    ListIterator listIterator = c1406dA.listIterator(i);
                    while (true) {
                        C1404b c1404b = (C1404b) listIterator;
                        if (!c1404b.hasNext()) {
                            break;
                        }
                        ResultColumn resultColumn = (ResultColumn) c1404b.next();
                        if (j.b(str3, resultColumn.getName())) {
                            c1406dB2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    C1406d c1406dA2 = r.a(c1406dB2);
                    if (c1406dA2.isEmpty()) {
                        throw new IllegalStateException(s.j("Column ", str3, " not found in result").toString());
                    }
                    arrayList2.add(c1406dA2);
                    i18++;
                    i = 0;
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new AmbiguousColumnResolver$resolve$1$2(arrayList, i16), 6, null);
            }
            i15++;
            i16 = i17;
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
            }
        }
        y yVar = new y();
        yVar.f18195a = Solution.Companion.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList, null, 0, new AnonymousClass4(yVar), 6, null);
        List<Match> matches = ((Solution) yVar.f18195a).getMatches();
        ArrayList arrayList3 = new ArrayList(t.l(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList3.add(C1110A.U(((Match) it2.next()).getResultIndices()));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }
}
