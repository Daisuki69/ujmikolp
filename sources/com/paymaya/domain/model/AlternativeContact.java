package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class AlternativeContact {

    @InterfaceC1497a
    @InterfaceC1498b("alternative_contact")
    private final String alternativeContact;

    public AlternativeContact(String alternativeContact) {
        j.g(alternativeContact, "alternativeContact");
        this.alternativeContact = alternativeContact;
    }

    public static /* synthetic */ AlternativeContact copy$default(AlternativeContact alternativeContact, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alternativeContact.alternativeContact;
        }
        return alternativeContact.copy(str);
    }

    public final String component1() {
        return this.alternativeContact;
    }

    public final AlternativeContact copy(String alternativeContact) {
        j.g(alternativeContact, "alternativeContact");
        return new AlternativeContact(alternativeContact);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlternativeContact) && j.b(this.alternativeContact, ((AlternativeContact) obj).alternativeContact);
    }

    public final String getAlternativeContact() {
        return this.alternativeContact;
    }

    public int hashCode() {
        return this.alternativeContact.hashCode();
    }

    public String toString() {
        return s.j("AlternativeContact(alternativeContact=", this.alternativeContact, ")");
    }
}
