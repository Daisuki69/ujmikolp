package Xh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f6669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6670b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6671d;

    public p(o oVar, List list) {
        if (list != null) {
            this.f6669a = oVar;
            this.f6670b = new ArrayList(list);
        } else {
            throw new IllegalArgumentException("Values can't be null for " + oVar.toString() + " filter");
        }
    }

    public p(List list, Si.d dVar) {
        Ri.a aVar;
        this.f6669a = o.f6668b;
        int i = 0;
        if (list.isEmpty()) {
            aVar = new Ri.a(Collections.EMPTY_LIST, 0);
        } else {
            TreeSet treeSet = new TreeSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String lowerCase = (String) it.next();
                if (lowerCase != null && !lowerCase.isEmpty()) {
                    if (lowerCase.trim().length() != lowerCase.length()) {
                        Ri.a.q("SDK config: Flag Set name " + lowerCase + " has extra whitespace, trimming");
                        lowerCase = lowerCase.trim();
                    }
                    if (!lowerCase.toLowerCase().equals(lowerCase)) {
                        Ri.a.q("SDK config: Flag Set name " + lowerCase + " should be all lowercase - converting string to lowercase");
                        lowerCase = lowerCase.toLowerCase();
                    }
                    if (lowerCase.matches("^[a-z0-9][_a-z0-9]{0,49}$")) {
                        if (!treeSet.add(lowerCase)) {
                            Ri.a.q("SDK config: you passed duplicated Flag Set. " + lowerCase + " was deduplicated");
                        }
                    } else {
                        i++;
                        Ri.a.q("SDK config: you passed " + lowerCase + ", Flag Set must adhere to the regular expressions ^[a-z0-9][_a-z0-9]{0,49}$. This means a Flag Set must be start with a letter, be in lowercase, alphanumeric and have a max length of 50 characters. " + lowerCase + " was discarded.");
                    }
                }
                i++;
            }
            aVar = new Ri.a(new ArrayList(treeSet), i);
        }
        this.f6670b = (List) aVar.c;
        int i4 = aVar.f5558b;
        this.c = i4;
        this.f6671d = list.size() - i4;
    }
}
