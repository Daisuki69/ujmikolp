package com.paymaya.domain.model;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ContactHeaderModel extends ContactListItem {
    private final String letter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactHeaderModel(String letter) {
        super(null);
        j.g(letter, "letter");
        this.letter = letter;
    }

    public static /* synthetic */ ContactHeaderModel copy$default(ContactHeaderModel contactHeaderModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactHeaderModel.letter;
        }
        return contactHeaderModel.copy(str);
    }

    public final String component1() {
        return this.letter;
    }

    public final ContactHeaderModel copy(String letter) {
        j.g(letter, "letter");
        return new ContactHeaderModel(letter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactHeaderModel) && j.b(this.letter, ((ContactHeaderModel) obj).letter);
    }

    public final String getLetter() {
        return this.letter;
    }

    public int hashCode() {
        return this.letter.hashCode();
    }

    public String toString() {
        return s.j("ContactHeaderModel(letter=", this.letter, ")");
    }
}
