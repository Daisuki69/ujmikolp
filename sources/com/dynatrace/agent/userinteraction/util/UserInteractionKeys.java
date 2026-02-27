package com.dynatrace.agent.userinteraction.util;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionKeys {
    private static final String ELEMENT = "ui_element";
    private static final String ELEMENT_ANCESTOR = "ui_element.ancestor";
    public static final String ELEMENT_ANCESTOR_COMPONENT = "ui_element.ancestor.component";
    public static final String ELEMENT_ANCESTOR_ID = "ui_element.ancestor.id";
    public static final String ELEMENT_ANCESTOR_NAME = "ui_element.ancestor.name";
    public static final String ELEMENT_COMPONENT = "ui_element.component";
    public static final String ELEMENT_ID = "ui_element.id";
    public static final String ELEMENT_NAME = "ui_element.name";
    public static final UserInteractionKeys INSTANCE = new UserInteractionKeys();
    public static final String INTERACTION_NAME = "interaction.name";

    public static final class Touch {
        public static final Touch INSTANCE = new Touch();
        public static final String POSITIONS = "positions";

        private Touch() {
        }
    }

    private UserInteractionKeys() {
    }
}
