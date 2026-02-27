package io.split.android.client.dtos;

import androidx.annotation.NonNull;
import g3.InterfaceC1498b;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class Prerequisite {

    @InterfaceC1498b("n")
    private String name;

    @InterfaceC1498b("ts")
    private Set<String> treatments;

    public Prerequisite() {
    }

    @NonNull
    public String getFlagName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    @NonNull
    public Set<String> getTreatments() {
        Set<String> set = this.treatments;
        return set == null ? new HashSet() : set;
    }

    public Prerequisite(String str, Set<String> set) {
        this.name = str;
        this.treatments = set;
    }
}
