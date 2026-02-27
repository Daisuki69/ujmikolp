package com.squareup.wire;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jj.InterfaceC1685a;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WireField {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Label {
        private static final /* synthetic */ InterfaceC1685a $ENTRIES;
        private static final /* synthetic */ Label[] $VALUES;
        public static final Label REQUIRED = new Label("REQUIRED", 0);
        public static final Label OPTIONAL = new Label("OPTIONAL", 1);
        public static final Label REPEATED = new Label("REPEATED", 2);
        public static final Label ONE_OF = new Label("ONE_OF", 3);
        public static final Label PACKED = new Label("PACKED", 4);
        public static final Label OMIT_IDENTITY = new Label("OMIT_IDENTITY", 5);

        private static final /* synthetic */ Label[] $values() {
            return new Label[]{REQUIRED, OPTIONAL, REPEATED, ONE_OF, PACKED, OMIT_IDENTITY};
        }

        static {
            Label[] labelArr$values = $values();
            $VALUES = labelArr$values;
            $ENTRIES = v0.h(labelArr$values);
        }

        private Label(String str, int i) {
        }

        public static InterfaceC1685a getEntries() {
            return $ENTRIES;
        }

        public static Label valueOf(String str) {
            return (Label) Enum.valueOf(Label.class, str);
        }

        public static Label[] values() {
            return (Label[]) $VALUES.clone();
        }

        public final boolean isOneOf() {
            return this == ONE_OF;
        }

        public final boolean isPacked() {
            return this == PACKED;
        }

        public final boolean isRepeated() {
            return this == REPEATED || this == PACKED;
        }
    }

    String adapter();

    String declaredName() default "";

    String jsonName() default "";

    String keyAdapter() default "";

    Label label() default Label.OPTIONAL;

    String oneofName() default "";

    boolean redacted() default false;

    int schemaIndex() default -1;

    int tag();
}
