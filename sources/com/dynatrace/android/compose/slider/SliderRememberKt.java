package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import wj.c;

/* JADX INFO: loaded from: classes2.dex */
public final class SliderRememberKt {
    @Composable
    public static final RangeSliderValueChangedCallback rememberRangeSliderOnValueChangeCallback(Function1<? super c, Unit> onValueChange, RangeSliderValueFinishedCallback finishedCallback, Composer composer, int i) {
        j.g(onValueChange, "onValueChange");
        j.g(finishedCallback, "finishedCallback");
        composer.startReplaceableGroup(-16661989);
        ComposerKt.sourceInformation(composer, "C(rememberRangeSliderOnValueChangeCallback)P(1)95@3758L104:SliderRemember.kt#vjm75m");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-16661989, i, -1, "com.dynatrace.android.compose.slider.rememberRangeSliderOnValueChangeCallback (SliderRemember.kt:94)");
        }
        composer.startReplaceableGroup(-1691723086);
        ComposerKt.sourceInformation(composer, "CC(remember):SliderRemember.kt#9igjgp");
        boolean zChanged = composer.changed(onValueChange);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new RangeSliderValueChangedCallback(onValueChange, finishedCallback);
            composer.updateRememberedValue(objRememberedValue);
        }
        RangeSliderValueChangedCallback rangeSliderValueChangedCallback = (RangeSliderValueChangedCallback) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rangeSliderValueChangedCallback;
    }

    @Composable
    public static final RangeSliderValueFinishedCallback rememberRangeSliderValueFinishedCallback(Function1<? super c, Unit> onValueChange, Modifier modifier, Function0<Unit> function0, boolean z4, Composer composer, int i, int i4) {
        j.g(onValueChange, "onValueChange");
        composer.startReplaceableGroup(201495675);
        ComposerKt.sourceInformation(composer, "C(rememberRangeSliderValueFinishedCallback)P(1)76@2967L142:SliderRemember.kt#vjm75m");
        if ((i4 & 4) != 0) {
            function0 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(201495675, i, -1, "com.dynatrace.android.compose.slider.rememberRangeSliderValueFinishedCallback (SliderRemember.kt:75)");
        }
        composer.startReplaceableGroup(1800701593);
        ComposerKt.sourceInformation(composer, "CC(remember):SliderRemember.kt#9igjgp");
        boolean zChanged = composer.changed(function0);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new RangeSliderValueFinishedCallback(onValueChange, modifier, function0, z4);
            composer.updateRememberedValue(objRememberedValue);
        }
        RangeSliderValueFinishedCallback rangeSliderValueFinishedCallback = (RangeSliderValueFinishedCallback) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rangeSliderValueFinishedCallback;
    }

    @Composable
    public static final SliderValueChangedCallback rememberSliderOnValueChangeCallback(Function1<? super Float, Unit> onValueChange, SliderValueFinishedCallback finishedCallback, Composer composer, int i) {
        j.g(onValueChange, "onValueChange");
        j.g(finishedCallback, "finishedCallback");
        composer.startReplaceableGroup(-352491528);
        ComposerKt.sourceInformation(composer, "C(rememberSliderOnValueChangeCallback)P(1)51@1932L99:SliderRemember.kt#vjm75m");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-352491528, i, -1, "com.dynatrace.android.compose.slider.rememberSliderOnValueChangeCallback (SliderRemember.kt:50)");
        }
        composer.startReplaceableGroup(-1377953848);
        ComposerKt.sourceInformation(composer, "CC(remember):SliderRemember.kt#9igjgp");
        boolean zChanged = composer.changed(onValueChange);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SliderValueChangedCallback(onValueChange, finishedCallback);
            composer.updateRememberedValue(objRememberedValue);
        }
        SliderValueChangedCallback sliderValueChangedCallback = (SliderValueChangedCallback) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderValueChangedCallback;
    }

    @Composable
    public static final SliderValueFinishedCallback rememberSliderValueFinishedCallback(Function1<? super Float, Unit> onValueChange, Modifier modifier, Function0<Unit> function0, boolean z4, Composer composer, int i, int i4) {
        j.g(onValueChange, "onValueChange");
        composer.startReplaceableGroup(1696842313);
        ComposerKt.sourceInformation(composer, "C(rememberSliderValueFinishedCallback)P(1)32@1197L137:SliderRemember.kt#vjm75m");
        if ((i4 & 4) != 0) {
            function0 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1696842313, i, -1, "com.dynatrace.android.compose.slider.rememberSliderValueFinishedCallback (SliderRemember.kt:31)");
        }
        composer.startReplaceableGroup(2114472623);
        ComposerKt.sourceInformation(composer, "CC(remember):SliderRemember.kt#9igjgp");
        boolean zChanged = composer.changed(function0);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SliderValueFinishedCallback(onValueChange, modifier, function0, z4);
            composer.updateRememberedValue(objRememberedValue);
        }
        SliderValueFinishedCallback sliderValueFinishedCallback = (SliderValueFinishedCallback) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderValueFinishedCallback;
    }
}
