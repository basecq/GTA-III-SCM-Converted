// -------------------------------------------------------
// ALL VARIABLES DEFINED BELOW UNLOCK FEATURES OF THE CODE
// -------------------------------------------------------
:DEBUG_VARIABLES
0004: $MASTERDEBUG                = 0 // Set to 1 to enable debug functions as defined in the STARTER thread.
if
	0038:   $MASTERDEBUG == 1  
then
	0004: $DEBUGUNLOCKISLANDS = 1
else
	0004: $DEBUGUNLOCKISLANDS	  = 0 // Unlock the other islands
end
0004: $DEBUGPACKAGESCOMPLETED	  = 0 // Set to 1 to activate all packages rewards
0004: $DEBUGPARAMEDICCOMPLETED	  = 0 // Set to 1 to trigger paramedic rewards
0004: $DEBUGVIGILANTECOMPLETED	  = 0 // Set to 1 to trigger vigilante rewards
0004: $DEBUGFIREFIGHTERCOMPLETED  = 0 // Set to 1 to trigger firefighter rewards
0004: $DEBUGIEGARAGESCOMPLETED    = 0 // Set to 1 to trigger import/export rewards
0004: $UNLOCKEXTRAS1		  = 0 // Set to 1 to enable the stuff that was commented out by R*
0004: $UNLOCKEXTRAS2		  = 0 // Set to 1 to enable custom extras
return

//#####################################################################################
//#####################################################################################
// END DEFINE DEBUG VARS / BEGIN TEMP THREAD INIT
//#####################################################################################
//#####################################################################################

:STARTER         //This thread is here to do stuff if $MASTERDEBUG is on
03A4: name_thread 'TMP_THR'
0111: set_wasted_busted_check_to 0

wait 1000 ms
if
	0038:   $MASTERDEBUG == 1  
then
	0004: $DEBUGUNLOCKISLANDS = 1
	0109: player $PLAYER_CHAR money += 10000000
	004F: create_thread @COORDS			// Enable if you need coordinates display in DEBUG mode
	004F: create_thread @MEAT_MISSION1_LOOP			//THE CROOK
	004F: create_thread @DIABLO_PHONE_START
	004F: create_thread @YARDIE_PHONE_START
	004F: create_thread @HOODS_PHONE_START
	004F: create_thread @JOEYS_BUGGY_LOOP


	//0055: set_player_coordinates $PLAYER_CHAR to 892.75 -425.75 13.875

	02A7: $LUIGI_MISSION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_LUIGI at 892.75 -425.75 13.875
	004F: create_thread @LUIGI_MISSION2_LOOP		//DONT SPANK MA BITCH UP
	//004F: create_thread @LUIGI_MISSION3_LOOP		//DRIVE MISTY FOR ME
	//004F: create_thread @LUIGI_MISSION4_LOOP		//PUMP ACTION PIMP
	//004F: create_thread @LUIGI_MISSION5_LOOP		//THE FUZZ BALL



	//0055: set_player_coordinates $PLAYER_CHAR to 1191.688 -873.0 -100.0

	02A7: $JOEY_MISSION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_JOEY at 1191.688 -870.0 -100.0
	004F: create_thread @JOEY_MISSION1_LOOP			//MIKE LIPS LAST LUNCH
	//004F: create_thread @JOEY_MISSION2_LOOP		//FAREWELL CHUNK YLEE CHONG
	//004F: create_thread @JOEY_MISSION3_LOOP		//VAN HEIST  
	//004F: create_thread @JOEY_MISSION4_LOOP		//CIPRIANIS CHAUFFEUR
	//004F: create_thread @JOEY_MISSION5_LOOP		//DEAD SKUNK IN THE TRUNK
	//004F: create_thread @JOEY_MISSION6_LOOP		//THE GETAWAY 



	//0055: set_player_coordinates $PLAYER_CHAR to 1219.563 -324.0 26.375

	02A7: $TONI_MISSION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_TONY at 1219.563 -321.0 26.375
	004F: create_thread @TONI_MISSION1_LOOP			//TAKING OUT THE LAUNDRY
	//004F: create_thread @TONI_MISSION2_LOOP		//THE PICKUP
	//004F: create_thread @TONI_MISSION3_LOOP		//SALVATORES CALLED A MEETING
	//004F: create_thread @TONI_MISSION4_LOOP		//TRIADS AND TRIBULATIONS
	//004F: create_thread @TONI_MISSION5_LOOP		//BLOW FISH



	//0055: set_player_coordinates $PLAYER_CHAR to 1458.688 -187.25 -100.0

	02A7: $SALVATORE_MISSION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_SAL at 1455.688 -187.25 -100.0
	004F: create_thread @FRANKIE_MISSION1_LOOP		//CHAPERONE
	//004F: create_thread @FRANKIE_MISSION2_LOOP		//CUTTING THE GRASS
	//004F: create_thread @FRANKIE_MISSION21_LOOP		//BOMB DA BASE ACT I
	//004F: create_thread @FRANKIE_MISSION3_LOOP		//BOMB DA BASE ACT II
	//004F: create_thread @FRANKIE_MISSION4_LOOP		//LAST REQUESTS



	//0055: set_player_coordinates $PLAYER_CHAR to 523.6875 -644.0 16.0625

	02A7: $ASUKA1_MISSION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_ASUKA at 523.6875 -643.0 16.0625
	004F: create_thread @ASUKA_MISSION1_LOOP		//SAYONARA SALVATORE
	//004F: create_thread @ASUKA_MISSION2_LOOP		//UNDER SURVEILLANCE
	//004F: create_thread @ASUKA_MISSION3_LOOP		//PAPARAZZI PURGE
	//004F: create_thread @ASUKA_MISSION4_LOOP		//PAYDAY FOR RAY
	//004F: create_thread @ASUKA_MISSION5_LOOP		//TWO FACED TANNER



	//0055: set_player_coordinates $PLAYER_CHAR to 456.3 -1415.4 26.2

	02A7: $KENJI_MISION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_KENJI at 459.0625 -1413.0 26.0625
	004F: create_thread @KENJI_MISSION1_LOOP		//KANBU BUST OUT
	//004F: create_thread @KENJI_MISSION2_LOOP		//GRAND THEFT AUTO
	//004F: create_thread @KENJI_MISSION3_LOOP		//DEAL STEAL
	//004F: create_thread @KENJI_MISSION4_LOOP		//SHIMA 
	//004F: create_thread @KENJI_MISSION5_LOOP		//SMACKDOWN



	//0055: set_player_coordinates $PLAYER_CHAR to 35.75 -725.375 -100.0

	02A7: $RAY_MISSION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_RAY at 38.75 -725.375 -100.0 
	004F: create_thread @RAY_MISSION1_LOOP			//SILENCE THE SNEAK
	//004F: create_thread @RAY_MISSION2_LOOP		//ARMS SHORTAGE
	//004F: create_thread @RAY_MISSION3_LOOP		//EVIDENCE DASH
	//004F: create_thread @RAY_MISSION4_LOOP		//GONE FISHING
	//004F: create_thread @RAY_MISSION5_LOOP		//PLASTER BLASTER
	//004F: create_thread @RAY_MISSION6_LOOP		//MARKED MAN



	//0055: set_player_coordinates $PLAYER_CHAR to 84.0625 -1548.688 28.25

	02A7: $DONALD_MISSION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_DON at 86.0625 -1548.688 28.25
	004F: create_thread @LOVE_MISSION1_LOOP			//LIBERATOR
	//004F: create_thread @LOVE_MISSION2_LOOP		//WAKA GASHIRA WIPEOUT
	//004F: create_thread @LOVE_MISSION3_LOOP		//A DROP IN THE OCEAN
	//004F: create_thread @LOVE_MISSION4_LOOP		//GRAND THEFT AERO
	//004F: create_thread @LOVE_MISSION5_LOOP		//ESCORT SERVICE
	//004F: create_thread @LOVE_MISSION6_LOOP		//DECOY
	//004F: create_thread @LOVE_MISSION7_LOOP		//LOVES DISAPPERANCE 



	//0055: set_player_coordinates $PLAYER_CHAR to 365.9375 -328.0 20.25

	02A7: $ASUKA2_MISSION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_ASUKA at 366.9375 -328.0 20.25
	004F: create_thread @ASUKA_SUBURBAN_MISSION1_LOOP		//BAIT
	//004F: create_thread @ASUKA_SUBURBAN_MISSION2_LOOP		//ESPRESSO 2 GO
	//004F: create_thread @ASUKA_SUBURBAN_MISSION3_LOOP		//SAM



	//0055: set_player_coordinates $PLAYER_CHAR to -362.75 240.875 60.0

	02A7: $COLUMBIAN_MANSION_MARKER = create_icon_marker_and_sphere RADAR_SPRITE_CAT at -362.75 245.875 60.0
	004F: create_thread @CAT_MISSION1_LOOP				//THE EXCHANGE


end
end_thread

//#####################################################################################
//#####################################################################################
// END TEMP THREAD INIT / BEGIN COORDINATES DISPLAY THREAD
//#####################################################################################
//#####################################################################################

:COORDS
03A4: name_thread 'PLR_POS'

while true
    wait 0 ms
    if 
        0256:   is_player $PLAYER_CHAR defined
    then
        0007: 4@ = 10.0  
        0007: 5@ = 10.0  
        0054: store_player $PLAYER_CHAR position_to 7@ 8@ 9@
	0170: 10@ = player $PLAYER_CHAR z_angle
	// For whatever reason the game only want to show the first two text boxes created, 
	// so we let X and Y be shown standard, and Z and Angle if the Look Behind key is held.
	if
		80E1:   not is_button_pressed PAD1 button RIGHTSHOCK // Look behind on foot, Sub-mission in vehicle.
	then
        	// X
       		0087: 2@ = 7@
        	gosub @COORDS_FRACT
        	gosub @COORDS_DRAW
        	// Y
        	0087: 2@ = 8@
        	gosub @COORDS_FRACT
        	gosub @COORDS_DRAW
        else
		// Z
        	0087: 2@ = 9@
        	gosub @COORDS_FRACT
        	gosub @COORDS_DRAW
        	// Angle
        	0087: 2@ = 10@
        	gosub @COORDS_FRACT
        	gosub @COORDS_DRAW
	end
        wait 250 ms
        03F0: text_draw_toggle  0
    end
end

:COORDS_FRACT
0092: 0@ = float_to_integer 2@    // Get the integer part
0093: 3@ = integer_to_float 0@    // By transforming back to float, fractional part disappears
0063: 2@ -= 3@                    // By subtracting integer part from original number, get only fractional part
0013: 2@ *=  100.0                // Round fractional part to two digits
0092: 1@ = float_to_integer 2@    // Convert fractional part to int
0095: make 1@ absolute_integer    // Fraction should be always positive
return

:COORDS_DRAW
gosub @COORDS_DRAW_SETUP
if
    0019:    1@ >  9
then
    045B: text_draw_2numbers 'POS1' number 0@  1@ at 4@ 5@  // ~1~.~1~
else
    045B: text_draw_2numbers 'POS1' number 0@  1@ at 4@ 5@  // ~1~.0~1~
end
000B: 5@ +=  15.0  
return

:COORDS_DRAW_SETUP
0340: set_text_draw_color  200  0  0  255
0341: set_text_draw_align_justify 1
03E4: set_text_draw_align_right  0
0343: set_text_linewidth  500.0
0348: set_text_draw_proportional  1
0342: set_text_draw_centered  0
0345: set_text_draw_in_box  0
033F: set_text_draw_letter_width_height 0.3 1.4 //0.5  1.8
return
