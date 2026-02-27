package com.paymaya.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BankPullListItem {
    public static final Companion Companion = new Companion(null);
    public static final int VIEW_TYPE_HEADER = 0;
    public static final int VIEW_TYPE_ITEM = 1;
    public static final int VIEW_TYPE_LINKED = 2;
    public static final int VIEW_TYPE_LINKED_ITEM = 3;
    public static final int VIEW_TYPE_NEW_LINKED = 4;
    private final int itemId;

    public static final class BankPullHeader extends BankPullListItem {
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankPullHeader(String title) {
            super(0, null);
            j.g(title, "title");
            this.title = title;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    public static final class BankPullItem extends BankPullListItem {
        private boolean hasReachedMaxLimit;
        private final BankPullPaymentOption paymentOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankPullItem(BankPullPaymentOption paymentOption, boolean z4) {
            super(1, null);
            j.g(paymentOption, "paymentOption");
            this.paymentOption = paymentOption;
            this.hasReachedMaxLimit = z4;
        }

        public final boolean getHasReachedMaxLimit() {
            return this.hasReachedMaxLimit;
        }

        public final BankPullPaymentOption getPaymentOption() {
            return this.paymentOption;
        }

        public final void setHasReachedMaxLimit(boolean z4) {
            this.hasReachedMaxLimit = z4;
        }
    }

    public static final class BankPullLinked extends BankPullListItem {
        private final List<BankPullPaymentOption> linkedPaymentOptionList;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankPullLinked(String title, List<BankPullPaymentOption> linkedPaymentOptionList) {
            super(2, null);
            j.g(title, "title");
            j.g(linkedPaymentOptionList, "linkedPaymentOptionList");
            this.title = title;
            this.linkedPaymentOptionList = linkedPaymentOptionList;
        }

        public final List<BankPullPaymentOption> getLinkedPaymentOptionList() {
            return this.linkedPaymentOptionList;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    public static final class BankPullLinkedItem extends BankPullListItem {
        private final BankPullPaymentOption paymentOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankPullLinkedItem(BankPullPaymentOption paymentOption) {
            super(3, null);
            j.g(paymentOption, "paymentOption");
            this.paymentOption = paymentOption;
        }

        public final BankPullPaymentOption getPaymentOption() {
            return this.paymentOption;
        }
    }

    public static final class BankPullNewLinked extends BankPullListItem {
        private final BankPullPaymentOption linkedPaymentOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankPullNewLinked(BankPullPaymentOption linkedPaymentOption) {
            super(4, null);
            j.g(linkedPaymentOption, "linkedPaymentOption");
            this.linkedPaymentOption = linkedPaymentOption;
        }

        public final BankPullPaymentOption getLinkedPaymentOption() {
            return this.linkedPaymentOption;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ BankPullListItem(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getItemId() {
        return this.itemId;
    }

    private BankPullListItem(int i) {
        this.itemId = i;
    }
}
