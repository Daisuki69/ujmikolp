package com.paymaya.domain.model;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public interface DynamicStatusBadge {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String STATUS_NAME_DOT = "dot";
    public static final String STATUS_NAME_NEW = "new";
    public static final String STATUS_NAME_PROMO = "promo";

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String STATUS_NAME_DOT = "dot";
        public static final String STATUS_NAME_NEW = "new";
        public static final String STATUS_NAME_PROMO = "promo";

        private Companion() {
        }
    }

    public static final class DotBadge implements DynamicStatusBadge {
        public static final DotBadge INSTANCE = new DotBadge();

        private DotBadge() {
        }
    }

    public static final class NewBadge implements DynamicStatusBadge {
        public static final NewBadge INSTANCE = new NewBadge();

        private NewBadge() {
        }
    }

    public static final class PromoBadge implements DynamicStatusBadge {
        private final String promoText;

        public PromoBadge(String promoText) {
            j.g(promoText, "promoText");
            this.promoText = promoText;
        }

        public final String getPromoText() {
            return this.promoText;
        }
    }
}
