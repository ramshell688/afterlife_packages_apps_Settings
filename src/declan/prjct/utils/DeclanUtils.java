package declan.prjct.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import java.util.Random;

public class DeclanUtils {
	
	public static int dpToPx(float dp) {
		return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
		Resources.getSystem().getDisplayMetrics()));
	}
	
	@ColorInt
	public static int getColorAttr(Context context, int attr) {
		TypedArray ta = context.obtainStyledAttributes(new int[] {attr});
		@ColorInt int color = ta.getColor(0, 0);
		ta.recycle();
		return color;
	}
}