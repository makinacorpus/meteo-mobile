/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.makina.meteofrance;

public final class R {
    public static final class anim {
        public static final int effect_alpha_content=0x7f040000;
        public static final int effect_bounce_content=0x7f040001;
        public static final int effect_duration_content=0x7f040002;
        public static final int effect_overshot_content=0x7f040003;
        public static final int effect_paralax_actions=0x7f040004;
        public static final int effect_replace_actions=0x7f040005;
        public static final int effect_replace_content=0x7f040006;
    }
    public static final class array {
        public static final int actions_color=0x7f080008;
        /**  Actions 
         */
        public static final int actions_icons=0x7f080006;
        public static final int actions_names=0x7f080007;
        public static final int bounce_effect=0x7f080004;
        public static final int effect_layouts=0x7f080001;
        public static final int effects_actions_html=0x7f080002;
        public static final int effects_content_html=0x7f080003;
        /**  Effects 
         */
        public static final int effects_name=0x7f080000;
        public static final int fade_max_value_strings=0x7f080010;
        public static final int fade_max_value_values=0x7f080011;
        public static final int fade_types=0x7f08000e;
        public static final int fade_types_values=0x7f08000f;
        public static final int fling_duration_strings=0x7f080014;
        public static final int fling_duration_values=0x7f080015;
        public static final int overshot_effect=0x7f080005;
        /**  Settings arrays 
         */
        public static final int spacing_types=0x7f080009;
        public static final int spacing_types_short=0x7f08000a;
        public static final int spacing_types_values=0x7f08000b;
        public static final int swiping_types=0x7f080012;
        public static final int swiping_types_values=0x7f080013;
        public static final int width_strings=0x7f08000c;
        public static final int width_values=0x7f08000d;
    }
    public static final class attr {
        /**  Actions layout ID to link at view creation time. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int actions_layout=0x7f010006;
        /**  Spacing value for actions container. 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int actions_spacing=0x7f010005;
        /**  Content layout ID to link at view creation time. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int content_layout=0x7f010007;
        /**  Actions layout effect. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int effect_actions=0x7f01000e;
        /**  Content layout effect. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int effect_content=0x7f01000f;
        /**  Enabled effects. 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td> None. </td></tr>
<tr><td><code>scroll_opening</code></td><td>1</td><td> Scroll opening. </td></tr>
<tr><td><code>scroll_closing</code></td><td>2</td><td> Scroll closing. </td></tr>
<tr><td><code>scroll</code></td><td>3</td><td> Scroll effects. </td></tr>
<tr><td><code>fling_opening</code></td><td>4</td><td> Fling opening. </td></tr>
<tr><td><code>fling_closing</code></td><td>8</td><td> Fling closing. </td></tr>
<tr><td><code>fling</code></td><td>12</td><td> Fling effects. </td></tr>
<tr><td><code>all</code></td><td>15</td><td> All (Opening and Closing). </td></tr>
</table>
         */
        public static final int effects=0x7f010002;
        /**  Effects interpolator 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int effects_interpolator=0x7f010010;
        /**  Max fade value. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int fade_max_value=0x7f01000a;
        /**  Default fade types. 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td> Fade is disabled. </td></tr>
<tr><td><code>actions</code></td><td>1</td><td> Fade applies to actions container. </td></tr>
<tr><td><code>content</code></td><td>2</td><td> Fade applies to content container. </td></tr>
<tr><td><code>both</code></td><td>3</td><td> Fade applies to every container. </td></tr>
</table>
         */
        public static final int fade_type=0x7f010001;
        /**  Indicates how long flinging will take time in milliseconds. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int fling_duration=0x7f01000b;
        /**  Drawable to be used to draw shadow dropped by content view to actions one. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int shadow_drawable=0x7f010008;
        /**  Shadow width. 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int shadow_width=0x7f010009;
        /**  Spacing value. 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int spacing=0x7f010004;
        /**  Default spacing types. 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>right_offset</code></td><td>0</td><td> Spacing will be calculated as offset from right bound of view. </td></tr>
<tr><td><code>actions_width</code></td><td>1</td><td> Spacing will be calculated as right bound of actions container. </td></tr>
</table>
         */
        public static final int spacing_type=0x7f010000;
        /**  Swiping edge width. 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int swiping_edge_width=0x7f01000c;
        /**  Swiping enabled. 
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int swiping_enabled=0x7f01000d;
        /**  Default swiping types. 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>full</code></td><td>0</td><td> Swiping will be handled at any point of screen. </td></tr>
<tr><td><code>edge</code></td><td>1</td><td> Swiping will be handled starting from screen edge only. </td></tr>
</table>
         */
        public static final int swiping_type=0x7f010003;
    }
    public static final class bool {
        public static final int default_pref_show_shadow=0x7f0a0000;
    }
    public static final class color {
        public static final int actions_bg=0x7f090003;
        public static final int actions_divider=0x7f090004;
        public static final int bottom_bar_bg=0x7f090002;
        public static final int bottom_bar_text=0x7f090001;
        public static final int color_clouds=0x7f090006;
        public static final int color_temp=0x7f090005;
        public static final int divider=0x7f090000;
    }
    public static final class dimen {
        public static final int actions_spacing=0x7f060007;
        public static final int default_actionscontentview_actions_spacing=0x7f060001;
        public static final int default_actionscontentview_spacing=0x7f060000;
        public static final int default_actionscontentview_swiping_edge_width=0x7f060002;
        public static final int default_pref_shadow_width=0x7f060003;
        public static final int default_pref_swiping_edge_width=0x7f060004;
        public static final int divider_large_size=0x7f060006;
        public static final int divider_size=0x7f060005;
    }
    public static final class drawable {
        public static final int bg_code=0x7f020000;
        public static final int ic_launcher=0x7f020001;
        public static final int ic_menu_moreoverflow_normal_holo_light=0x7f020002;
        public static final int item_background_holo_light=0x7f020003;
        public static final int list_focused_holo=0x7f020004;
        public static final int list_longpressed_holo=0x7f020005;
        public static final int list_pressed_holo_light=0x7f020006;
        public static final int list_selector_background_transition_holo_light=0x7f020007;
        public static final int list_selector_disabled_holo_light=0x7f020008;
        public static final int nuage=0x7f020009;
        public static final int orage=0x7f02000a;
        public static final int progress_bg_holo_light=0x7f02000b;
        public static final int progress_horizontal_holo_light=0x7f02000c;
        public static final int progress_primary_holo_light=0x7f02000d;
        public static final int progress_secondary_holo_light=0x7f02000e;
        public static final int shadow=0x7f02000f;
        public static final int temperature=0x7f020010;
    }
    public static final class id {
        public static final int actions=0x7f050003;
        public static final int actionsContentView=0x7f050013;
        public static final int actions_html=0x7f050016;
        public static final int actions_width=0x7f050001;
        public static final int all=0x7f05000c;
        public static final int bar=0x7f05000f;
        public static final int both=0x7f050005;
        public static final int bottomBar=0x7f050019;
        public static final int content=0x7f050004;
        public static final int content_html=0x7f050018;
        public static final int divider=0x7f050011;
        public static final int edge=0x7f05000e;
        public static final int effect_actions_layout=0x7f050015;
        public static final int effect_content_layout=0x7f050017;
        public static final int effect_name=0x7f050014;
        public static final int fling=0x7f05000b;
        public static final int fling_closing=0x7f05000a;
        public static final int fling_opening=0x7f050009;
        public static final int full=0x7f05000d;
        public static final int g3mWidgetHolder=0x7f050010;
        public static final int none=0x7f050002;
        public static final int prefFadeMaxValue=0x7f05001c;
        public static final int prefFadeMaxValueValue=0x7f05001d;
        public static final int prefFadeType=0x7f05001a;
        public static final int prefFadeTypeValue=0x7f05001b;
        public static final int prefFlingDuration=0x7f05001e;
        public static final int prefFlingDurationValue=0x7f05001f;
        public static final int prefShadowWidth=0x7f050022;
        public static final int prefShadowWidthValue=0x7f050023;
        public static final int prefShowShadow=0x7f050020;
        public static final int prefShowShadowValue=0x7f050021;
        public static final int prefSpacingActionsWidth=0x7f050029;
        public static final int prefSpacingActionsWidthValue=0x7f05002a;
        public static final int prefSpacingType=0x7f050024;
        public static final int prefSpacingTypeValue=0x7f050025;
        public static final int prefSpacingWidth=0x7f050026;
        public static final int prefSpacingWidthAdditionalValue=0x7f050027;
        public static final int prefSpacingWidthValue=0x7f050028;
        public static final int prefSwipingEdgeWidth=0x7f05002d;
        public static final int prefSwipingEdgeWidthValue=0x7f05002e;
        public static final int prefSwipingType=0x7f05002b;
        public static final int prefSwipingTypeValue=0x7f05002c;
        public static final int right_offset=0x7f050000;
        public static final int scroll=0x7f050008;
        public static final int scroll_closing=0x7f050007;
        public static final int scroll_opening=0x7f050006;
        public static final int title=0x7f050012;
    }
    public static final class integer {
        public static final int default_actionscontentview_fade_max_value=0x7f070000;
        public static final int default_actionscontentview_fling_duration=0x7f070001;
        public static final int default_pref_fade_max_value=0x7f070002;
        public static final int default_pref_fling_delay=0x7f070003;
    }
    public static final class layout {
        public static final int action_list_item=0x7f030000;
        public static final int actions=0x7f030001;
        public static final int activity_simplest_raster=0x7f030002;
        public static final int category_list_item=0x7f030003;
        public static final int content=0x7f030004;
        public static final int effect_actions=0x7f030005;
        public static final int effect_alpha=0x7f030006;
        public static final int effect_bounce=0x7f030007;
        public static final int effect_content=0x7f030008;
        public static final int effect_duration=0x7f030009;
        public static final int effect_overshot=0x7f03000a;
        public static final int effect_parallax=0x7f03000b;
        public static final int effect_replace=0x7f03000c;
        public static final int main_activity=0x7f03000d;
        public static final int pref_fade=0x7f03000e;
        public static final int pref_other=0x7f03000f;
        public static final int pref_shadow=0x7f030010;
        public static final int pref_spacing=0x7f030011;
        public static final int pref_swiping=0x7f030012;
    }
    public static final class string {
        public static final int app_name=0x7f0b0008;
        public static final int effect_alpha=0x7f0b001c;
        public static final int effect_alpha_content_html=0x7f0b0007;
        public static final int effect_bounce=0x7f0b001e;
        public static final int effect_bounce_content_html=0x7f0b0006;
        /**  Effects content strings 
         */
        public static final int effect_content_actions_xml=0x7f0b0020;
        public static final int effect_content_content_xml=0x7f0b0021;
        public static final int effect_duration=0x7f0b001d;
        public static final int effect_duration_content_html=0x7f0b0005;
        public static final int effect_overshot=0x7f0b001f;
        public static final int effect_overshot_content_html=0x7f0b0004;
        /**  Effects 
         */
        public static final int effect_parallax=0x7f0b001a;
        /**  HTML 
         */
        public static final int effect_parallax_actions_html=0x7f0b0001;
        public static final int effect_replace=0x7f0b001b;
        public static final int effect_replace_actions_html=0x7f0b0002;
        public static final int effect_replace_content_html=0x7f0b0003;
        public static final int nuages=0x7f0b0019;
        public static final int pref_fade=0x7f0b0010;
        public static final int pref_fade_max_value=0x7f0b0012;
        public static final int pref_fade_type=0x7f0b0011;
        public static final int pref_other=0x7f0b0016;
        public static final int pref_other_fling_duration=0x7f0b0017;
        public static final int pref_shadow=0x7f0b000d;
        public static final int pref_shadow_width=0x7f0b000f;
        public static final int pref_show_shadow=0x7f0b000e;
        /**  Setting strings 
         */
        public static final int pref_spacing=0x7f0b0009;
        public static final int pref_spacing_actions=0x7f0b000c;
        public static final int pref_spacing_type=0x7f0b000a;
        public static final int pref_spacing_width=0x7f0b000b;
        public static final int pref_swiping=0x7f0b0013;
        public static final int pref_swiping_edge_width=0x7f0b0015;
        public static final int pref_swiping_type=0x7f0b0014;
        public static final int sources_link=0x7f0b0000;
        /**  Action titles 
         */
        public static final int temp=0x7f0b0018;
    }
    public static final class style {
        public static final int AppTheme=0x7f0c0000;
        public static final int HeaderText=0x7f0c0002;
        public static final int HoloButton_Borderless=0x7f0c0001;
    }
    public static final class styleable {
        /** Attributes that can be used with a ActionsContentView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ActionsContentView_actions_layout com.makina.meteofrance:actions_layout}</code></td><td> Actions layout ID to link at view creation time.</td></tr>
           <tr><td><code>{@link #ActionsContentView_actions_spacing com.makina.meteofrance:actions_spacing}</code></td><td> Spacing value for actions container.</td></tr>
           <tr><td><code>{@link #ActionsContentView_content_layout com.makina.meteofrance:content_layout}</code></td><td> Content layout ID to link at view creation time.</td></tr>
           <tr><td><code>{@link #ActionsContentView_effect_actions com.makina.meteofrance:effect_actions}</code></td><td> Actions layout effect.</td></tr>
           <tr><td><code>{@link #ActionsContentView_effect_content com.makina.meteofrance:effect_content}</code></td><td> Content layout effect.</td></tr>
           <tr><td><code>{@link #ActionsContentView_effects com.makina.meteofrance:effects}</code></td><td> Enabled effects.</td></tr>
           <tr><td><code>{@link #ActionsContentView_effects_interpolator com.makina.meteofrance:effects_interpolator}</code></td><td> Effects interpolator </td></tr>
           <tr><td><code>{@link #ActionsContentView_fade_max_value com.makina.meteofrance:fade_max_value}</code></td><td> Max fade value.</td></tr>
           <tr><td><code>{@link #ActionsContentView_fade_type com.makina.meteofrance:fade_type}</code></td><td> Fade type.</td></tr>
           <tr><td><code>{@link #ActionsContentView_fling_duration com.makina.meteofrance:fling_duration}</code></td><td> Indicates how long flinging will take time in milliseconds.</td></tr>
           <tr><td><code>{@link #ActionsContentView_shadow_drawable com.makina.meteofrance:shadow_drawable}</code></td><td> Drawable to be used to draw shadow dropped by content view to actions one.</td></tr>
           <tr><td><code>{@link #ActionsContentView_shadow_width com.makina.meteofrance:shadow_width}</code></td><td> Shadow width.</td></tr>
           <tr><td><code>{@link #ActionsContentView_spacing com.makina.meteofrance:spacing}</code></td><td> Spacing value.</td></tr>
           <tr><td><code>{@link #ActionsContentView_spacing_type com.makina.meteofrance:spacing_type}</code></td><td> Spacing type.</td></tr>
           <tr><td><code>{@link #ActionsContentView_swiping_edge_width com.makina.meteofrance:swiping_edge_width}</code></td><td> Swiping edge width.</td></tr>
           <tr><td><code>{@link #ActionsContentView_swiping_enabled com.makina.meteofrance:swiping_enabled}</code></td><td> Swiping enabled.</td></tr>
           <tr><td><code>{@link #ActionsContentView_swiping_type com.makina.meteofrance:swiping_type}</code></td><td> Swiping type.</td></tr>
           </table>
           @see #ActionsContentView_actions_layout
           @see #ActionsContentView_actions_spacing
           @see #ActionsContentView_content_layout
           @see #ActionsContentView_effect_actions
           @see #ActionsContentView_effect_content
           @see #ActionsContentView_effects
           @see #ActionsContentView_effects_interpolator
           @see #ActionsContentView_fade_max_value
           @see #ActionsContentView_fade_type
           @see #ActionsContentView_fling_duration
           @see #ActionsContentView_shadow_drawable
           @see #ActionsContentView_shadow_width
           @see #ActionsContentView_spacing
           @see #ActionsContentView_spacing_type
           @see #ActionsContentView_swiping_edge_width
           @see #ActionsContentView_swiping_enabled
           @see #ActionsContentView_swiping_type
         */
        public static final int[] ActionsContentView = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003,
            0x7f010004, 0x7f010005, 0x7f010006, 0x7f010007,
            0x7f010008, 0x7f010009, 0x7f01000a, 0x7f01000b,
            0x7f01000c, 0x7f01000d, 0x7f01000e, 0x7f01000f,
            0x7f010010
        };
        /**
          <p>
          @attr description
           Actions layout ID to link at view creation time. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:actions_layout
        */
        public static final int ActionsContentView_actions_layout = 6;
        /**
          <p>
          @attr description
           Spacing value for actions container. 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:actions_spacing
        */
        public static final int ActionsContentView_actions_spacing = 5;
        /**
          <p>
          @attr description
           Content layout ID to link at view creation time. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:content_layout
        */
        public static final int ActionsContentView_content_layout = 7;
        /**
          <p>
          @attr description
           Actions layout effect. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:effect_actions
        */
        public static final int ActionsContentView_effect_actions = 14;
        /**
          <p>
          @attr description
           Content layout effect. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:effect_content
        */
        public static final int ActionsContentView_effect_content = 15;
        /**
          <p>
          @attr description
           Enabled effects. 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td> None. </td></tr>
<tr><td><code>scroll_opening</code></td><td>1</td><td> Scroll opening. </td></tr>
<tr><td><code>scroll_closing</code></td><td>2</td><td> Scroll closing. </td></tr>
<tr><td><code>scroll</code></td><td>3</td><td> Scroll effects. </td></tr>
<tr><td><code>fling_opening</code></td><td>4</td><td> Fling opening. </td></tr>
<tr><td><code>fling_closing</code></td><td>8</td><td> Fling closing. </td></tr>
<tr><td><code>fling</code></td><td>12</td><td> Fling effects. </td></tr>
<tr><td><code>all</code></td><td>15</td><td> All (Opening and Closing). </td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:effects
        */
        public static final int ActionsContentView_effects = 2;
        /**
          <p>
          @attr description
           Effects interpolator 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:effects_interpolator
        */
        public static final int ActionsContentView_effects_interpolator = 16;
        /**
          <p>
          @attr description
           Max fade value. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:fade_max_value
        */
        public static final int ActionsContentView_fade_max_value = 10;
        /**
          <p>
          @attr description
           Fade type. 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td> Fade is disabled. </td></tr>
<tr><td><code>actions</code></td><td>1</td><td> Fade applies to actions container. </td></tr>
<tr><td><code>content</code></td><td>2</td><td> Fade applies to content container. </td></tr>
<tr><td><code>both</code></td><td>3</td><td> Fade applies to every container. </td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:fade_type
        */
        public static final int ActionsContentView_fade_type = 1;
        /**
          <p>
          @attr description
           Indicates how long flinging will take time in milliseconds. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:fling_duration
        */
        public static final int ActionsContentView_fling_duration = 11;
        /**
          <p>
          @attr description
           Drawable to be used to draw shadow dropped by content view to actions one. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:shadow_drawable
        */
        public static final int ActionsContentView_shadow_drawable = 8;
        /**
          <p>
          @attr description
           Shadow width. 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:shadow_width
        */
        public static final int ActionsContentView_shadow_width = 9;
        /**
          <p>
          @attr description
           Spacing value. 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:spacing
        */
        public static final int ActionsContentView_spacing = 4;
        /**
          <p>
          @attr description
           Spacing type. 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>right_offset</code></td><td>0</td><td> Spacing will be calculated as offset from right bound of view. </td></tr>
<tr><td><code>actions_width</code></td><td>1</td><td> Spacing will be calculated as right bound of actions container. </td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:spacing_type
        */
        public static final int ActionsContentView_spacing_type = 0;
        /**
          <p>
          @attr description
           Swiping edge width. 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:swiping_edge_width
        */
        public static final int ActionsContentView_swiping_edge_width = 12;
        /**
          <p>
          @attr description
           Swiping enabled. 


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:swiping_enabled
        */
        public static final int ActionsContentView_swiping_enabled = 13;
        /**
          <p>
          @attr description
           Swiping type. 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>full</code></td><td>0</td><td> Swiping will be handled at any point of screen. </td></tr>
<tr><td><code>edge</code></td><td>1</td><td> Swiping will be handled starting from screen edge only. </td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.makina.meteofrance:swiping_type
        */
        public static final int ActionsContentView_swiping_type = 3;
    };
}
