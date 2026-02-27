package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.SupportedOutputSizesSorter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ResolutionsMerger {
    private static final double SAME_AREA_WIDTH_HEIGHT_RATIO = Math.sqrt(2.3703703703703702d);
    private static final String TAG = "ResolutionsMerger";

    @NonNull
    private final CameraInfoInternal mCameraInfo;

    @NonNull
    private final Map<UseCaseConfig<?>, List<Size>> mChildSizesCache;

    @NonNull
    private final Set<UseCaseConfig<?>> mChildrenConfigs;

    @NonNull
    private final Rational mFallbackAspectRatio;

    @NonNull
    private final Rational mSensorAspectRatio;

    @NonNull
    private final Size mSensorSize;

    @NonNull
    private final SupportedOutputSizesSorter mSizeSorter;

    public static class CompareAspectRatioByOverlappingAreaToReference implements Comparator<Rational> {

        @NonNull
        private final Rational mReferenceAspectRatio;
        private final boolean mReverse;

        public CompareAspectRatioByOverlappingAreaToReference(@NonNull Rational rational, boolean z4) {
            this.mReferenceAspectRatio = rational;
            this.mReverse = z4;
        }

        @Override // java.util.Comparator
        public int compare(@NonNull Rational rational, @NonNull Rational rational2) {
            float fComputeAreaOverlapping = ResolutionsMerger.computeAreaOverlapping(rational, this.mReferenceAspectRatio);
            float fComputeAreaOverlapping2 = ResolutionsMerger.computeAreaOverlapping(rational2, this.mReferenceAspectRatio);
            return this.mReverse ? Float.compare(fComputeAreaOverlapping2, fComputeAreaOverlapping) : Float.compare(fComputeAreaOverlapping, fComputeAreaOverlapping2);
        }
    }

    public ResolutionsMerger(@NonNull CameraInternal cameraInternal, @NonNull Set<UseCaseConfig<?>> set) {
        this(TransformUtils.rectToSize(cameraInternal.getCameraControlInternal().getSensorRect()), cameraInternal.getCameraInfoInternal(), set);
    }

    private boolean areCroppingInDifferentDirection(float f, float f3, float f7) {
        if (f != f3 && f3 != f7) {
            if (f > f3) {
                return f3 < f7;
            }
            if (f3 > f7) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float computeAreaOverlapping(@NonNull Rational rational, @NonNull Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    @NonNull
    private List<Size> filterOutChildSizesCausingDoubleCropping(@NonNull Rational rational, @NonNull List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!isDoubleCropping(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static List<Size> filterOutChildSizesThatWillNeverBeSelected(@NonNull List<Size> list) {
        Rational rational;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it.next();
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    break;
                }
            }
            if (rational != null) {
                Size size2 = (Size) map.get(rational);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rational = toRational(size);
            }
            arrayList.add(size);
            map.put(rational, size);
        }
        return arrayList;
    }

    @NonNull
    @VisibleForTesting
    public static List<Size> filterOutParentSizeThatIsTooSmall(@NonNull Collection<Size> collection, @NonNull List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    @NonNull
    @VisibleForTesting
    public static List<Size> filterResolutionsByAspectRatio(@NonNull Rational rational, @NonNull List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    @NonNull
    private static Rational findCloserAspectRatio(@NonNull Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > SAME_AREA_WIDTH_HEIGHT_RATIO ? AspectRatioUtil.ASPECT_RATIO_16_9 : AspectRatioUtil.ASPECT_RATIO_4_3;
    }

    @NonNull
    private List<Size> getCameraSupportedHighResolutions() {
        return this.mCameraInfo.getSupportedHighResolutions(34);
    }

    @NonNull
    private List<Size> getCameraSupportedResolutions() {
        return this.mCameraInfo.getSupportedResolutions(34);
    }

    @NonNull
    private static Rect getCenterCroppedRectangle(@NonNull Rational rational, @NonNull Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = toRational(size);
        if (rational.floatValue() == rational2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rational2.floatValue()) {
                float f = width;
                float fFloatValue = f / rational.floatValue();
                float f3 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f3, f, fFloatValue + f3);
            } else {
                float f7 = height;
                float fFloatValue2 = rational.floatValue() * f7;
                float f10 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f10, 0.0f, fFloatValue2 + f10, f7);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    @NonNull
    private Set<Size> getChildrenRequiredResolutions() {
        HashSet hashSet = new HashSet();
        Iterator<UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (it.hasNext()) {
            hashSet.addAll(getSortedChildSizes(it.next()));
        }
        return hashSet;
    }

    @NonNull
    @VisibleForTesting
    public static Rect getCropRectOfReferenceAspectRatio(@NonNull Size size, @NonNull Size size2) {
        return getCenterCroppedRectangle(toRational(size2), size);
    }

    @NonNull
    private static Rational getFallbackAspectRatio(@NonNull Rational rational) {
        Rational rational2 = AspectRatioUtil.ASPECT_RATIO_4_3;
        if (rational.equals(rational2)) {
            return AspectRatioUtil.ASPECT_RATIO_16_9;
        }
        if (rational.equals(AspectRatioUtil.ASPECT_RATIO_16_9)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    @NonNull
    @VisibleForTesting
    public static List<Size> getParentSizesThatAreTooLarge(@NonNull Collection<Size> collection, @NonNull List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listRemoveDuplicates = removeDuplicates(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listRemoveDuplicates) {
            if (isAllChildSizesCanBeCroppedOutWithoutUpscalingParent(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    @NonNull
    private Pair<Rect, Size> getPreferredChildSizePairInternal(@NonNull Rect rect, @NonNull UseCaseConfig<?> useCaseConfig, boolean z4) {
        Size preferredChildSize;
        if (z4) {
            preferredChildSize = getPreferredChildSizeForViewport(TransformUtils.rectToSize(rect), useCaseConfig);
        } else {
            Size sizeRectToSize = TransformUtils.rectToSize(rect);
            preferredChildSize = getPreferredChildSize(sizeRectToSize, useCaseConfig);
            rect = getCropRectOfReferenceAspectRatio(sizeRectToSize, preferredChildSize);
        }
        return new Pair<>(rect, preferredChildSize);
    }

    @NonNull
    private static Rational getSensorAspectRatio(@NonNull Size size) {
        Rational rationalFindCloserAspectRatio = findCloserAspectRatio(size);
        Logger.d(TAG, "The closer aspect ratio to the sensor size (" + size + ") is " + rationalFindCloserAspectRatio + ".");
        return rationalFindCloserAspectRatio;
    }

    @NonNull
    private List<Size> getSortedChildSizes(@NonNull UseCaseConfig<?> useCaseConfig) {
        if (!this.mChildrenConfigs.contains(useCaseConfig)) {
            throw new IllegalArgumentException("Invalid child config: " + useCaseConfig);
        }
        if (this.mChildSizesCache.containsKey(useCaseConfig)) {
            List<Size> list = this.mChildSizesCache.get(useCaseConfig);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listFilterOutChildSizesThatWillNeverBeSelected = filterOutChildSizesThatWillNeverBeSelected(this.mSizeSorter.getSortedSupportedOutputSizes(useCaseConfig));
        this.mChildSizesCache.put(useCaseConfig, listFilterOutChildSizesThatWillNeverBeSelected);
        return listFilterOutChildSizesThatWillNeverBeSelected;
    }

    @NonNull
    private static List<Size> getSupportedPrivResolutions(@NonNull List<Pair<Integer, Size[]>> list) {
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    @NonNull
    private Map<Rational, List<Size>> groupSizesByAspectRatio(@NonNull List<Size> list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        map.put(rational, new ArrayList());
        Rational rational2 = AspectRatioUtil.ASPECT_RATIO_16_9;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        for (Size size : list) {
            if (size.getHeight() > 0) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it.next();
                    if (AspectRatioUtil.hasMatchingAspectRatio(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rational4 = toRational(size);
                    arrayList2.add(rational4);
                    map.put(rational4, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    @VisibleForTesting
    public static boolean hasUpscaling(@NonNull Size size, @NonNull Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static boolean isAllChildSizesCanBeCroppedOutWithoutUpscalingParent(@NonNull Collection<Size> collection, @NonNull Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (hasUpscaling(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent(@NonNull Collection<Size> collection, @NonNull Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!hasUpscaling(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    private boolean isDoubleCropping(@NonNull Rational rational, @NonNull Size size) {
        if (this.mSensorAspectRatio.equals(rational) || AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
            return false;
        }
        return areCroppingInDifferentDirection(this.mSensorAspectRatio.floatValue(), rational.floatValue(), toRationalWithMod16Considered(size).floatValue());
    }

    private boolean needToAddSensorResolutions() {
        Iterator<Size> it = getChildrenRequiredResolutions().iterator();
        while (it.hasNext()) {
            if (!AspectRatioUtil.hasMatchingAspectRatio(it.next(), this.mFallbackAspectRatio)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    private static List<Size> removeDuplicates(@NonNull List<Size> list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    @NonNull
    @VisibleForTesting
    public static Rect reverseRect(@NonNull Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    @NonNull
    private List<Size> selectOtherAspectRatioParentResolutionsWithFovPriority(@NonNull List<Size> list, boolean z4) {
        Map<Rational, List<Size>> mapGroupSizesByAspectRatio = groupSizesByAspectRatio(list);
        ArrayList<Rational> arrayList = new ArrayList(mapGroupSizesByAspectRatio.keySet());
        sortByFov(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(AspectRatioUtil.ASPECT_RATIO_16_9) && !rational.equals(AspectRatioUtil.ASPECT_RATIO_4_3)) {
                List<Size> list2 = mapGroupSizesByAspectRatio.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(selectParentResolutionsByAspectRatio(rational, list2, z4));
            }
        }
        return arrayList2;
    }

    @NonNull
    private List<Size> selectParentResolutions(@NonNull List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (needToAddSensorResolutions()) {
            arrayList.addAll(selectParentResolutionsByAspectRatio(this.mSensorAspectRatio, list, false));
        }
        arrayList.addAll(selectParentResolutionsByAspectRatio(this.mFallbackAspectRatio, list, false));
        arrayList.addAll(selectOtherAspectRatioParentResolutionsWithFovPriority(list, false));
        if (arrayList.isEmpty()) {
            Logger.w(TAG, "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(selectOtherAspectRatioParentResolutionsWithFovPriority(list, true));
        }
        Logger.d(TAG, "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private List<Size> selectParentResolutionsByAspectRatio(@NonNull Rational rational, @NonNull List<Size> list, boolean z4) {
        List<Size> listFilterResolutionsByAspectRatio = filterResolutionsByAspectRatio(rational, list);
        sortInDescendingOrder(listFilterResolutionsByAspectRatio);
        HashSet hashSet = new HashSet(listFilterResolutionsByAspectRatio);
        Iterator<UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (it.hasNext()) {
            List<Size> sortedChildSizes = getSortedChildSizes(it.next());
            if (!z4) {
                sortedChildSizes = filterOutChildSizesCausingDoubleCropping(rational, sortedChildSizes);
            }
            if (sortedChildSizes.isEmpty()) {
                return new ArrayList();
            }
            listFilterResolutionsByAspectRatio = filterOutParentSizeThatIsTooSmall(sortedChildSizes, listFilterResolutionsByAspectRatio);
            hashSet.retainAll(getParentSizesThatAreTooLarge(sortedChildSizes, listFilterResolutionsByAspectRatio));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listFilterResolutionsByAspectRatio) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private boolean shouldIncludeHighResolutions() {
        boolean z4;
        ResolutionSelector resolutionSelector;
        Iterator<UseCaseConfig<?>> it = this.mChildrenConfigs.iterator();
        while (true) {
            z4 = false;
            if (!it.hasNext()) {
                break;
            }
            UseCaseConfig<?> next = it.next();
            if (!next.isHighResolutionDisabled(false) && (next instanceof ImageOutputConfig) && (resolutionSelector = ((ImageOutputConfig) next).getResolutionSelector(null)) != null) {
                z4 = true;
                if (resolutionSelector.getAllowedResolutionMode() == 1) {
                    break;
                }
            }
        }
        return z4;
    }

    private void sortByFov(@NonNull List<Rational> list) {
        Collections.sort(list, new CompareAspectRatioByOverlappingAreaToReference(toRational(this.mSensorSize), true));
    }

    @VisibleForTesting
    public static void sortInDescendingOrder(@NonNull List<Size> list) {
        Collections.sort(list, new CompareSizesByArea(true));
    }

    @NonNull
    private static Rational toRational(@NonNull Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    @NonNull
    private static Rational toRationalWithMod16Considered(@NonNull Size size) {
        Rational rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
            return rational;
        }
        Rational rational2 = AspectRatioUtil.ASPECT_RATIO_16_9;
        return AspectRatioUtil.hasMatchingAspectRatio(size, rational2) ? rational2 : toRational(size);
    }

    @NonNull
    public List<Size> getMergedResolutions(@NonNull MutableConfig mutableConfig) {
        List<Size> cameraSupportedResolutions = getCameraSupportedResolutions();
        if (shouldIncludeHighResolutions()) {
            ArrayList arrayList = new ArrayList(cameraSupportedResolutions);
            arrayList.addAll(getCameraSupportedHighResolutions());
            cameraSupportedResolutions = arrayList;
        }
        List list = (List) mutableConfig.retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
        if (list != null) {
            cameraSupportedResolutions = getSupportedPrivResolutions(list);
        }
        return selectParentResolutions(cameraSupportedResolutions);
    }

    @NonNull
    @VisibleForTesting
    public Size getPreferredChildSize(@NonNull Size size, @NonNull UseCaseConfig<?> useCaseConfig) {
        List<Size> sortedChildSizes = getSortedChildSizes(useCaseConfig);
        for (Size size2 : sortedChildSizes) {
            if (!isDoubleCropping(size, size2) && !hasUpscaling(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : sortedChildSizes) {
            if (!hasUpscaling(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    @NonNull
    @VisibleForTesting
    public Size getPreferredChildSizeForViewport(@NonNull Size size, @NonNull UseCaseConfig<?> useCaseConfig) {
        Iterator<Size> it = getSortedChildSizes(useCaseConfig).iterator();
        while (it.hasNext()) {
            Size sizeRectToSize = TransformUtils.rectToSize(getCropRectOfReferenceAspectRatio(it.next(), size));
            if (!hasUpscaling(sizeRectToSize, size)) {
                return sizeRectToSize;
            }
        }
        return size;
    }

    @NonNull
    public Pair<Rect, Size> getPreferredChildSizePair(@NonNull UseCaseConfig<?> useCaseConfig, @NonNull Rect rect, int i, boolean z4) {
        boolean z5;
        if (TransformUtils.is90or270(i)) {
            rect = reverseRect(rect);
            z5 = true;
        } else {
            z5 = false;
        }
        Pair<Rect, Size> preferredChildSizePairInternal = getPreferredChildSizePairInternal(rect, useCaseConfig, z4);
        Rect rectReverseRect = (Rect) preferredChildSizePairInternal.first;
        Size sizeReverseSize = (Size) preferredChildSizePairInternal.second;
        if (z5) {
            sizeReverseSize = TransformUtils.reverseSize(sizeReverseSize);
            rectReverseRect = reverseRect(rectReverseRect);
        }
        return new Pair<>(rectReverseRect, sizeReverseSize);
    }

    private ResolutionsMerger(@NonNull Size size, @NonNull CameraInfoInternal cameraInfoInternal, @NonNull Set<UseCaseConfig<?>> set) {
        this(size, cameraInfoInternal, set, new SupportedOutputSizesSorter(cameraInfoInternal, size));
    }

    @VisibleForTesting
    public ResolutionsMerger(@NonNull Size size, @NonNull CameraInfoInternal cameraInfoInternal, @NonNull Set<UseCaseConfig<?>> set, @NonNull SupportedOutputSizesSorter supportedOutputSizesSorter) {
        this.mChildSizesCache = new HashMap();
        this.mSensorSize = size;
        Rational sensorAspectRatio = getSensorAspectRatio(size);
        this.mSensorAspectRatio = sensorAspectRatio;
        this.mFallbackAspectRatio = getFallbackAspectRatio(sensorAspectRatio);
        this.mCameraInfo = cameraInfoInternal;
        this.mChildrenConfigs = set;
        this.mSizeSorter = supportedOutputSizesSorter;
    }

    private boolean isDoubleCropping(@NonNull Size size, @NonNull Size size2) {
        return isDoubleCropping(toRationalWithMod16Considered(size), size2);
    }
}
