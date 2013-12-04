meteo-mobile
============

A basic PhoneGap prototype for Meteo France

To use Natif version you need two open source library

global3mobile : https://github.com/glob3mobile/g3m

ActionContentView : https://github.com/StevenRudenko/ActionsContentView

After import library we need to modify g3m libray G3MSharedSDK in org.glob3.mobile.generated.WMSLayer:
we need to remove this line from class ( are twice)  :
 if (req.charAt(req.length() - 1) != '?')
     {
        req += '?';
     }


