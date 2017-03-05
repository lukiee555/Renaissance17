package com.example.lucky.renaissance17;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.lucky.renaissance17.FlowingActivities.MainFlowingActivity;


public class Information extends AppCompatActivity implements TabHost.OnTabChangeListener {

    TextView tv1,tv2,tv3,tv4,tv5,tv6;


    private static final int ANIMATION_TIME = 240;
    private TabHost tabHost;
    private View previousView;
    private View currentView;
    private int currentTab;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);
        tv5=(TextView)findViewById(R.id.textView5);
        tv6=(TextView)findViewById(R.id.textView6);
        TabHost host=(TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("About");
        spec.setContent(R.id.about);
        spec.setIndicator("About");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Contact");
        spec.setContent(R.id.contact);
        spec.setIndicator("Contact");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Register");
        spec.setContent(R.id.register);
        spec.setIndicator("Register");
        host.addTab(spec);
        public AnimatedTabHostListener(TabHost tabHost)
        {
            this.tabHost = tabHost;
            this.previousView = tabHost.getCurrentView();
        }

        if(SplashContent.a==1){
           tv1.setText("Antakshri is a spoken parlor game played in India, Bangladesh, Pakistan and Nepal.Each contestant sings the first verse of movie(Bollywood songs) that begins with the Hindustani consonant on which the previous consonant’s song selection ended.\n" +
                   "\n" +
                   "Round 1: Meri awaz suno\n" +
                   "Round 2: Main hoon kon\n" +
                   "Round 3: Jodi round \n" +
                   "Round 4: Shabd Jaal");
            tv2.setText("RULES\n"+"1.Songs have to be started from the last sound of the previous song\n" +
                    "2.Only songs from the Bollywood movies are allowed by default\n" +
                    "3.At least the first verse of the song must be sung\n" +
                    "4.If a singer does not remember it entirely, they cannot sing the song\n" +
                    "5.No song is repeated again in the game");
            tv3.setText("Entry Fee : ₹150 for a team of upto 3 members\n" +
                    "\n" +
                    "1st Prize : ₹2000");
            tv4.setText("VENUE \n"+"Date: 10th March, 2017\n" +
                    "Time: 12:00 PM to 3:00 PM\n" +
                    "Venue: Quadrangle A-Block");
            tv5.setText("Surya Veer Singh : +91-7727850085\n" +
                    "Preksha Jain\n" +
                    "Shivangi Nangia\n" +
                    "Ayushi Aeran\n" +
                    "Ashwini Jain");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });
        }
        else if(SplashContent.a==2){

            tv1.setText("One thing good about beats.. When it hits you, you Feel! The character " +
                "of instrumental music let the emotion radiate and shine in their own character");


            tv2.setText("RULES\n"+"Round I: In round one, participant will be given time for 210 seconds (3.5 min.) to " +
                    "play any instrument in which he has excelled his skills and enthrall the audience and judges with" +
                    " his melodious performance.\n" +
                    "\n" +
                    "Round II: The participants selected in the 1st round will move ahead and will get a chance " +
                    "to make their 2nd appearance at the stage. In this round the participants will be given 300 " +
                    "seconds (5 min.) and they have to match their " +
                    "tone on the instruments with a track playing in the background." +
                    " Participants needs yo carry their own tracks in pen drives. Sounds more fun!");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹1500");
            tv4.setText("VENUE\n"+"Date: 9th March, 2017\n" +
                    "Time: 9:30 AM to 12:30 PM\n" +
                    "Venue: Auditorium A Block");
            tv5.setText("Contacts\n"+"Akhil Singhal : +91-8107394437\n" +
                    "Shreyansh Chopra : +91-8233506444\n" +
                    "Gaurav Pareek : +91-7023166507\n" +
                    "Hitendra Dubey : +91-9509657682");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });
        }
       else if(SplashContent.a==3){

            tv1.setText("In this Competition, Each participating team has to face four rounds which basically " +
                    "checks individual’s physical and mental strength. This competition is based on the theme of reality show ”ROADIES”.");
            tv2.setText("RULES\n"+"1.Each Team consists of 4 members each.\n" +
                    "2.Atleast one member should be a girl.\n" +
                    "3.Decision of judges would be final.\n" +
                    "4.Materials required for the task would be provided by the organizers and no other material is allowed.\n" +
                    "5.Each team has to report at the correct time failing to which would result in the disqualification of the team.");
            tv3.setText("Entry Fee : ₹400 (4 members)\n" +
                    "\n" +
                    "1st Prize : ₹3000");
            tv4.setText("VENUE\n"+"Date: 10th March, 2017\n" +
                    "Time: 12:00 NOON to 3:30 PM\n" +
                    "Venue: Central Lawn");
            tv5.setText("Contacts\n"+"Prateek Chaurasiya : +91-8562840270\n" +
                    "Harshit Sharma : +91- 8769563355\n" +
                    "Dhruval Bharadwaj : +91-9672830652 \n" +
                    "Varsha Chaturvedi\n" +
                    "Kajal Khandelwal");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });



        }
      else if(SplashContent.a==4){
            tv1.setText("A fun event focusing on giving an entertainment quotient by having normal pillow" +
                    " fight with a twist. Twist starts when there is no ground base to act. People will find " +
                    "themselves at a certain height of " +
                    "5-6 feet above the ground managing to attain a grip and at " +
                    "the same time trying to knock-out their worthy opponent.");
            tv2.setText("RULES\n"+"1.At the start a minute or two will be given for adjusting and forming grip.\n" +
                    "2.A span of 5 minutes would be given for the knockout process.\n" +
                    "3.No crossing of legs or any other form of grip attaining technique allowed.\n" +
                    "4.If no trying of knockout process observed within two minutes, then contestants will be disqualified.\n" +
                    "5.Fighting with pillows is entertained only.");
            tv3.setText("Entry Fee : ₹30\n" +
                    "\n" +
                    "kinds");
            tv4.setText("VENUE\n"+"Date: 8th March, 2017 and 11th March, 2017\n" +
                    "Time: 11:30 AM to 4:30 PM and 11:30 AM to 2:30PM respectively\n" +
                    "Venue: BH-2 Lawn");
            tv5.setText("Contact"+"Bhaskar Sharma : +91-9309443567\n" +
                    "Suman Kanwar");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });
        }

        else if(SplashContent.a==5){

            tv1.setText("So you got Rapping and Rhymes in your Blood? Here is the event RAP-ZAP for your Rapping Skills!\n" +
                    "Grab the Stage To Kick some Rhymes with Sick Beats.\n" +
                    "Rap Zap gets you audience, music, stage; then it’s you and Your Raps, and cheering crowd!\n" +
                    "\n" +
                    "1st ROUND : ELIMINATION ROUND\n" +
                    "2nd ROUND : FINAL ROUND");

            tv2.setText("RULES\n"+"1.Entries for solo and duo.\n" +
                    "2.No vulgarity shall be included in the rap.\n" +
                    "3.Arguments with the judges may cancel your participation.\n" +
                    "4.No age limit.\n" +
                    "5.All participants must prepare 2 raps which they are going to perform on stage.\n" +
                    "6.Participants should bring their background music along with themselves.");

            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹3500 \n" +
                    "2nd Prize : ₹1500\n" +
                    "\n");
            tv4.setText("VENUE\n"+"Date: 8th March, 2017\n" +
                    "Time: 12:00 NOON to 3:00 PM\n" +
                    "Venue: Auditorium A Block");

            tv5.setText("Contact\n"+"Gaurav Gupta : +91-7891072568\n" +
                    "Damina Chauhan\n" +
                    "Aashi Vashishth\n" +
                    "Megha Gupta");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });
        }


       else if(SplashContent.a==6){
            tv1.setText("This cricket game is set in the back streets of the city. \n" +
                    "Get down and dirty with this gully cricket game.\n");
            tv2.setText("RULES\n"+"1.wicket-keeper from batting team.\n" +
                    "2.no runs behind the wickets.\n" +
                    "3.no LBWs.\n" +
                    "4.mini overs (4 balls per over).\n" +
                    "5.maximum 2 over only for 1 bowler\n" +
                    "6.5 overs per inning (baby overs).\n" +
                    "7.5 players per team.\n" +
                    "8.Every wide ball has free hit\n" +
                    "9.one hand one-bounce catch.\n" +
                    "10.boundary out (without bounce).");
            tv3.setText("Entry Fee : ₹250 (5 members)\n" +
                    "\n" +
                    "1st Prize : ₹2500 \n" +
                    "2nd Prize : ₹1500\n" +
                    "\n");

            tv4.setText("Date: 8th and 9th March, 2017\n" +
                    "Time: 11:30 AM to 4:30 PM\n" +
                    "Venue: BH 2 Lawn, C Block Lawns");

            tv5.setText("Ashish Jha: +91-7073295152\n" +
                    "Anmol Bhatnagar: +91-9462904377\n" +
                    "Kumar Sanu : +91-7073662153\n" +
                    "Nikhil garg : +91-7791900859\n" +
                    "Zeeshan Ansari : +91-8504996564");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });

        }
       else if(SplashContent.a==7){

                tv1.setText("1.Counter Strike1.6\n" +
                        "2.Counter Strike GO\n" +
                        "3.DOTA 2\n" +
                        "4.FIFA 15\n" +
                        "5.NFS-MW\n" +
                        "6.Call of duty(modern warlfare)(single,multiple)\n" +
                        "7.Tekken 5\n" +
                        "8.Mini Militia");

            tv2.setText("Counter Strike:\n" +
                    "\n" +
                    "5 vs. 5 (team play, 5 players per team)\n" +
                    "Version - counter strike 1.6 & Counter strike GO\n" +
                    "Shotguns, shields, automatic sniper are not allowed\n" +
                    "\n" +
                    "Victory condition:\n" +
                    "The first team to win 16 rounds is declared the winner. (8 as CT and 8 as T) \n" +
                    "Maps to be used:\n" +
                    "On the spot map will be given\n" +
                    "There will be a toss to decide which map to play. There will be a knife round to decide the side (CTT)\n" +
                    "\n" +
                    "Game settings:\n" +
                    "Round time - 1 minute 45 seconds\n" +
                    "C4 timer - 35 seconds\n" +
                    "C4 timer - 35 seconds\n" +
                    "Players are allowed to bring their gaming accessories- keyboard, mouse, mouse pad)fsnrv\n" +
                    "Default skins must be used\n" +
                    "Any other use of map or program bugs can result in a warning at the minimum or loss by default for the offending team after deliberation and decision bybthe board or referees at its sole discretion.\n" +
                    "Initial start money USD 800\n" +
                    "In case of tie breaker further 6 rounds will be played (3 as CT and 3 as T)\n" +
                    "\n" +
                    "DOTA 2:\n" +
                    "\n" +
                    "A Team has to consist of Max 5 participants. Those persons will be called \"team members\" or \"members\" of the team in the following.\n" +
                    "All teams have to provide the administration the following information upon request: full names of all members and identity of the captain.\n" +
                    "The hero pool always consists of all heroes the game mode allows and might therefore change several times during the competition. The game must not be paused during the draft, unless a drafter disconnects.\n" +
                    "If any serious bugs occur, the game has to be paused immediately and the administration decides how to continue. Knowingly abusing a bug is strictly forbidden.\n" +
                    "The usage of any Dota-related tool aside from Steam and Dota 2 during a match is strictly forbidden.\n" +
                    "A game is finished, when an Ancient Fortress is destroyed, when the majority of a team leaves on purpose, or when the administration decides on it. (note: A game is not forfeited, when a player types \"gg\" or \"ff\". Always wait for the ancient to be destroyed!)\n" +
                    "Legal proceedings are not permitted.\n" +
                    "By attending the competition participants acknowledge without limitation to comply with the rules and regulations, official announcement, and with the statements and decisions made by the referees.\n" +
                    "Every participant has to show the needed respect towards referees and other participants. Insults and unfair or disrespectful behaviour towards anyone are not tolerated and will be punished.\n" +
                    "\n" +
                    "FIFA 14:\n" +
                    "\n" +
                    "Attendance\n" +
                    "Players need to be ready to play at the allotted start time or will forfeit match.\n" +
                    "We suggest if players know they are running late that they should contact the venue and inform them to ensure that they do not lose their place in the event.\n" +
                    "If a player turns up late OR fails to complete a fixture with no valid excuse, then a win is awarded to opponent.\n" +
                    "\n" +
                    "Controllers and Settings\n" +
                    "Players are advised to bring their own controllers if they prefer.\n" +
                    "Players are responsible to ensure their controller configuration is correct at all times.\n" +
                    "\n" +
                    "Game Settings\n" +
                    "Match\n" +
                    "Half Length: 6 minutes (Variable)\n" +
                    "Difficulty Level: World Class\n" +
                    "Referee: Random\n" +
                    "Stadium: Wembley Stadium\n" +
                    "Time of Day: Day\n" +
                    "Weather: Dry\n" +
                    "Game Speed: Normal\n" +
                    "Ball: Default\n" +
                    "Knockout stages: If draw extra time followed by penalties\n" +
                    "Camera\n" +
                    "Tele Broadcast or to be agreed by both players before match\n" +
                    "Rules\n" +
                    "Injuries: Off\n" +
                    "Offsides: On\n" +
                    "Bookings: On\n" +
                    "Handball: Off\n" +
                    "Teams = Players can use any \"real\" teams in the game (excluding fantasy teams) and may also swap teams during the event. Any others = Default\n" +
                    "\n" +
                    "Admin Rights\n" +
                    "Admins reserve the right to add to, or amend the rules at any time.\n" +
                    "In the course of any disputes the Admins decision will be final and all players involved must abide by the ruling given, any player failing to do so risks being removed from the event.\n" +
                    "\n" +
                    "NFS-MW:\n" +
                    "\n" +
                    "Attendance\n" +
                    "The participant needs to be ready to play at the allotted time otherwise he/she will be disqualified effective immediately.\n" +
                    "If the participant knows that it can be late to attend the game at the allotted time, then he/she must inform the coordinator immediately so as to get a new allotment of time.\n" +
                    "If the participant is a FINALE candidate and fails to make it to the match then he/she will be disqualified and the opponent will be declared as WINNER.\n" +
                    "\n" +
                    "Controllers\n" +
                    "The participants are allowed to bring their own console/keyboard if they want to.\n" +
                    "If the participant’s controller gets lost or they forget to take them back, they will be responsible for their loss themselves.\n" +
                    "If the participant’s controller is not working properly, they are advised toinform before the match starts otherwise it will be considered as an excuse.\n" +
                    "\n" +
                    "During Match\n" +
                    "If the participant gets caught using any sort of cheat codes, he/she will be disqualified effective immediately.\n" +
                    "If it is found that the match/match settings has been tampered with, all the players of that match will be disqualified effective immediately.\n" +
                    "\n" +
                    "GAME SETTINGS\n" +
                    "Tracks : CLASSIFIED\n" +
                    "Cars Selection : By the Coordinator.\n" +
                    "Nitrous : Disabled\n" +
                    "Collision Impact : Enabled\n" +
                    "Types of tracks : Circuit, Sprint\n" +
                    "Other Settings : Default\n" +
                    "ADMIN RIGHTS\n" +
                    "In case of any error or system malfunctions, the admin’s decision will be the final one.\n" +
                    "The participants have to obey the Admin’s decision, no questions asked.");
            tv3.setText("Entry Fee :\n" +
                    "\n" +
                    "Counter Strike1.6 : ₹600 per team\n" +
                    "DOTA 2 : ₹600 per team\n" +
                    "FIFA 14 : ₹150\n" +
                    "NFS-MW : ₹100\n" +
                    "Mili Militia : ₹40\n" +
                    "Teken 5 : ₹50\n" +
                    "COD Single Player : ₹100\n" +
                    "COD Multi player : ₹400\n" +
                    "CS GO : ₹600\n" +
                    "\n" +
                    "1st PRIZE :\n" +
                    "\n" +
                    "Counter Strike1.6 : ₹5000 per team\n" +
                    "DOTA 2 : ₹1500 per team\n" +
                    "FIFA 14 : ₹1500\n" +
                    "NFS-MW : ₹1500\n" +
                    "Teken 5 : ₹1000\n" +
                    "COD Single Player : ₹1000\n" +
                    "COD Multi player : ₹6000\n" +
                    "CS GO : ₹4500");
            tv4.setText("Date: 8th to 10th March, 2017\n" +
                    "Time: 11:30 AM to 4:30 PM\n" +
                    "Venue: CP-21,22,23");
            tv5.setText("Vishal Verma : +91-8233663390\n" +
                    "Udit Koolwal : +91-8502874309\n" +
                    "Shubham Kalani : +91-7597377782\n" +
                    "Diwanshu Soni : +91-9602235988");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });

        }

        else if(SplashContent.a==8){
            tv1.setText("Face painting is about showing creativity by painting on face on a given theme.\n" +
                    "Best creation will be awarded.face painting can be hobby for some or even a full blown career for many talented artist.\n" +
                    "In the team one member will do the painting on other team member.Competition will consist of two rounds.\n" +
                    "First Round will be of 2 hours,according to a given THEME, face painting is done.\n" +
                    "our jugdes will select top 5 teams.Then second round will be a SOCIAL round .");
            tv2.setText("RULES\n"+"Each team consist of 2 players.\n" +
                    "competition will consist of two rounds.\n" +
                    "Teams should complete their work in the given time limit.\n" +
                    "Team is not allowed to bring extra material.\n" +
                    "Material required is provided.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹1200 \n" +
                    "2nd Prize : ₹800\n" +
                    "\n");

            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 10:00 AM to 1:00 PM\n" +
                    "Venue: Quadrangle A-Block");
            tv5.setText("Garvit Mittal : +91-7737521979\n" +
                    "Ashita Bansal\n" +
                    "Akansha Gupta");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });

        }
       else if(SplashContent.a==9){
            tv1.setText("A cool event full of madness & excitement. Participate, play some crazy games & experience total madness with your friend.\n" +
                    "Pagalpanti bhi zarori h...Kyuki there is no genius without some touch of madness.\n" +
                    "Explore the madness in you this Renaissance.");

            tv2.setText("Participation in a team of two members is necessary .\n" +
                    "Decision of Judges shall be final.\n" +
                    "Three round will take place\n" +
                    "Follow all the instructiions which were given by the organiser\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Round 1: Face the cookies ,ballon blow,cold drinkstraw with poney, spoonge,sari\n" +
                    "\n" +
                    "Round 2: Collect the things \n" +
                    "Dress up boy by girl\n" +
                    "\n" +
                    "Round 3: blind fold");
            tv3.setText("Entry Fee : ₹100 (2 members)\n" +
                    "\n" +
                    "1st Prize : ₹1,200 \n" +
                    "2nd Prize : ₹ 800");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 2:00 AM to 4:30 PM\n" +
                    "Venue: B 301 & LT 7 B Block");
            tv5.setText("Rahul Yadav : +91-7023252990\n" +
                    "Attika Sharma\n" +
                    "Yash rawat : +91-9782862495\n" +
                    "Deekshant : +91-9782978096");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });

        }
       else if(SplashContent.a==10){

            tv1.setText("Do you have what it takes to bring the field on fire ? Is football the game u live ??Do you have a Leo Messi or Neymar Jr. 11 inside you?? Then for you, the countdown begins !!");

            tv2.setText("RULES\n"+"Every team consists of 5 Players + 2 Subs .\n" +
                    "10-2-10 minutes playing time .\n" +
                    "Goal scored from inside the D will not be valid .\n" +
                    "Free kick would be awarded from centre line, only GK is allowed to stop the ball .\n" +
                    "GK should not touch the ball with hand .\n" +
                    "On Handball of GK, penalty will be awarded .\n" +
                    "If match ends in a draw, the result will be decided from penalties .\n" +
                    "No Offside rule .\n" +
                    "The decision of referee will be considered final .\n" +
                    "Any misbehaviour will lead to team disqualification .\n" +
                    "All players must carry their college id’s with them .\n" +
                    "The team players must report 15 minutes prior to the match time.");

            tv3.setText("Entry Fee : ₹700 per team\n" +
                    "\n" +
                    "1st prize : 4000(Boys) 2500(Girls) \n" +
                    "2nd Prize : ₹2000(Boys) 1000(Girls)");

            tv4.setText("Date: 10th and 11th March, 2017\n" +
                    "Time: 9:30 AM to 6:30 PM\n" +
                    "Venue: C-Block Lawns");
            tv5.setText("Rishabh Bhardwaj : +91-7568322492\n" +
                    "Deepak Choudhary : +91-8058003131\n" +
                    "Shobit Yadav : +91-9571945667\n" +
                    "Sanidhya Mahovia : +91-9928436850\n" +
                    "Vedant Sharma : +91-7023278489");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });

        }
       else if(SplashContent.a==11){
            tv1.setText("MINUTE TO WIN features competitors facing various challenges that escalate in level of difficulty using everyday household items. Each game has a one-minute time limit and failure to finish the task on time will eliminate the contestant. But it'll take nerves of steel to complete all the tasks to win the grand prize.\n" +
                    "\n" +
                    "So get ready to bang on because you got only a MINUTE TO WIN.");

            tv2.setText("RULES"+"Each team consisting of 2 members.\n" +
                    "The game consisting of 5 rounds. Each round is a elimination.");

            tv3.setText("Entry Fee : ₹100\n" +
                    "\n" +
                    "1st Prize : ₹1000 \n" +
                    "2nd Prize : ₹500");
            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 9:30 AM to 11:30 PM\n" +
                    "Venue: Quadrangle A-Block");
            tv5.setText("Raunak Agarwal : +91-9829490896\n" +
                    "Ashish Sharma : +91-8440920920");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });
        }

       else if(SplashContent.a==12){
            tv1.setText("Are you a SHERLOCK FAN? Do you love solving mysteries? Bring it on guys ! Here we are up with an event AGENT 221. Be the first SHERLOKIAN of JECRC and get #SHERLOCKED !");


            tv2.setText("RULES\n"+"There will be a defined time limit for every round.\n" +
                    "Decorum maitainance is must!\n" +
                    "Round I: (BRAINSTROMER)Show us what you got !\n" +
                    "Questions related to basic crime investigation.\n" +
                    "\n" +
                    "Round II: ( CASE STUDY )\n" +
                    "Participants will be given a case , suspects and clues to solve the mystery in limited time frame.\n" +
                    "\n" +
                    "Round III: ( GET SHERLOCKED )\n" +
                    "Teams will act as detective and will find the culprit by given leads. participants must find all the clues related to case.");

            tv3.setText("Entry Fee : ₹150 (3 members)\n" +
                    "\n" +
                    "1st Prize : ₹2000");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 11:30 AM to 2:00 PM\n" +
                    "Venue: C-501 C-Block");
            tv5.setText("Shivam Khandelwal : +91-9413360008\n" +
                    "Era Sharma");




            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });

        }

      else  if(SplashContent.a==13){

            tv1.setText("Make an apparel (clothing and 'outfitting' which includes equipment/accessories worn or carried for function or decoration) out of items which are normally thrown out as trash.");

            tv2.setText("RULES\n"+"Participants in a team of at most 3 and minimum 2 are required to make an outfit from the material provided by the organizers (limited material).\n" +
                    "Materials would be given by organizers prior to event and any other material is not allowed.\n" +
                    "Decision of judges shall be final and binding.\n" +
                    "One of the team members may wear the dress after completion.\n" +
                    "Two round will be take place.\n" +
                    "Only 1 additional material will provide in limited amount, if required.\n" +
                    "Time Limit : 2.5 Hours");

            tv3.setText("Entry Fee : ₹300 for a team of upto 3 members\n" +
                    "\n" +
                    "1st Prize : ₹1800 \n" +
                    "2nd Prize : ₹1200");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 9:30 AM to 11:30 AM\n" +
                    "Venue: LT-7 B Block");
            tv5.setText("Abha Kabra : +91-9414444533\n" +
                    "Kashish Jindal\n" +
                    "Harshit Sharma : +91-9694188467\n" +
                    "Megha Sharma");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });

        }
      else if(SplashContent.a==14){
            tv1.setText("Round I:\n" +
                    "Give words to a pair of changing pictures displayed for 2 minutes with the best partner you can get and test both of your's compatibility.\n" +
                    "\n" +
                    "Round II:\n" +
                    "EVER WONDERED? What would happen when SUPERMAN meets JETHALAL? Stop wondering, create the scene. Pick any 2 characters from a set of 50 characters given to you, and in a given preparation time of 15 minutes, create an action packed dialogue of a minute or two. STOP STOP STOP, Your mimicry or your acting wouldn't be tested here, your creativity and mind skills would be.");

            tv2.setText("RULES\n"+"There should be team of two members.\n" +
                    "The activity can be performed in English, Hindi or both.\n" +
                    "Uses of props is not just allowed but will be appreciated.\n" +
                    "Judges decision would be final.");
            tv3.setText("Entry Fee : ₹150 (2 members)\n" +
                    "\n" +
                    "1st Prize : ₹1000 \n" +
                    "2nd Prize : ₹500");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 1:30 PM to 4:30 PM\n" +
                    "Venue: C 401 C Block");
            tv5.setText("Shivani Gupta\n" +
                    "Ayushi dravid\n" +
                    "Kavya Chaturvedi\n" +
                    "Shubham Singh : +91-8559890072");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });

        }

        else if(SplashContent.a==15){
            tv1.setText("Paintball is a variation on tag that involves players on competing teams shooting paint-filled balls at each other using air-powered guns. Paintball is a very fun game and very safe if players will just wear their masks.\n" +
                    "\n" +
                    "The basic game of paintball consists of players trying to hit members of the other team with paintballs which will break and \"mark\" or \"eliminate\" that player. The first team with all its players eliminated loses. There are countless variations of this basic game including capture the flag.\n" +
                    "\n" +
                    "Paintball has been played since the early 1980s and is enjoyed by millions of players across the world. It is an exciting sport that encourages sportsmanship, requires strategy, and is a great way to exercise and meet new friends.\n" +
                    "\n" +
                    "If you haven't ever tried paintball, it's time to head to Renaissance'16 and try out this great sport.");
            tv2.setText("RULES\n"+"Each team consist of 5 players.\n" +
                    "Paintball purchase cant be reimbursed.\n" +
                    "Players must play within the boundries allocated to their teams.\n" +
                    "players can prevent themselves being hit by the balls.\n" +
                    "Players are not allowed to move with their barricates.");
            tv3.setText("Entry Fee : ₹600 per team\n" +
                    "Total 100 shots\n" +
                    "\n" +
                    "will be updated soon");
            tv4.setText("Date: 9th to 11th March, 2017\n" +
                    "Time: 9:30 AM to 4:30 PM\n" +
                    "Venue: GH Lawn");
            tv5.setText("Kartik : +91-7877696859\n" +
                    "Rishabh : +91-9509393263");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });




        }
       else if(SplashContent.a==16){

            tv1.setText("Round I:\n" +
                    "The LONE HUNTERS: Hunt for the objects with a friend of yours mentioned in the list. Search and find them across the nations, with your jet if you have one, else BEG BORROW STEAL in the campus. It can be as easy as a leaf, or something that ll take years,a 2 number shoe.\n" +
                    "\n" +
                    "Round II:\n" +
                    "THE HUNTING WRITERS: THE FINALE: Har shikaar ki jese ek kahaani hoti hai, vese hi iss shikaar ki bhi ek kahaani hogi. Bring the list of objects to life. The successful hunters would now write a story, on a theme given to them, but the catch is, all objects that you have hunted, have to be included somehow in story. Don't forget to bring spark of your imagination.");

            tv2.setText("RULES\n"+"Round I:\n" +
                    "This round is about BEG BORROW STEAL, so the only rule is \"HUNT FOR ALL OBJECTS\", participants would be judged on basis of no.of successful items hunted.\n" +
                    "\n" +
                    "\n" +
                    "Round II:\n" +
                    "No.of objects mentioned in the story, will be the primary judging criteria.\n" +
                    "Separate points would be earned on the basis of creativity and humor and also the style of writing.\n" +
                    "Language is no boundation.\n" +
                    "Judges decision would be final.");

            tv3.setText("Entry Fee : ₹150 (2 members)\n" +
                    "\n" +
                    "1st Prize : ₹2000 \n" +
                    "2nd Prize : ₹1000");
            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 2:00 PM to 4:30 PM\n" +
                    "Venue: C 401 C Block");
            tv5.setText("Hemant Khandelwal : +91- 8963824692 \n" +
                    "Megha Chabra\n" +
                    "Aparna Tripathi\n" +
                    "Rishabh Singhal : +91-9461080982");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/2rQhT26M8fWveax43"));
                    startActivity(i);             }
            });
        }
        else if(SplashContent.a==17){
            tv1.setText("As someone truly said, “Dance is the hidden language of the soul”. Dancing can alleviate one from stress and troubles and is a delight for the dancers as well as the audience. One can express oneself through dance in a way which is not possible otherwise.\n" +
                    "It would indeed be a pleasure as well honor for us to have your college dance team as a part of the group dance competition, BOOTSTRAPPING and more importantly a part of the fest.");

            tv2.setText("RULES\n"+"Max 2 teams per college are allowed and each participant shall bring his/her valid original college ID card on the day.\n" +
                    "The min. no. of participants should be 5 (on stage) and maximum is 20. [on stage – min(5) max(15)]\n" +
                    "Time limit will be between 7+1 minutes.\n" +
                    "Pre-recorded music should be brought in a CD/DVD as well as in pen drive in .cda AND .mp3 format only (Other formats may not be supported on the computer – use them at your own risk).\n" +
                    "The teams should bring their own portable music system for practice.\n" +
                    "Individuality & originality of the dance is encouraged.\n" +
                    "Dancers are not restricted from performing any move but they must be aware that it is their own responsibility to ensure that they do not perform moves that could injure themselves or others.\n" +
                    "Obscenity of any kind is not allowed and will lead to immediate disqualification.\n" +
                    "Use of only stage is allowed.\n" +
                    "The use of fireworks, colours,fire and water acts are not allowed.\n" +
                    "There is no restrictions on theme.\n" +
                    "All participants in a group should belong to the same technical or management institution.\n" +
                    "The accommodation for the team outside of Jaipur will be free.\n" +
                    "Decision of the judges and the organizing committee would be final on any issue.");

            tv3.setText("Entry Fee : ₹1,800 (For teams, 5-20 members)\n" +
                    "\n" +
                    "1st Prize : INR 22,000 (INR 16000 cash + gift vouchers worth INR 6000)\n" +
                    "2nd Prize : INR 12,000 (INR 8000 cash + gift vouchers worth INR 4000)");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 7:30 PM to 10:00 PM\n" +
                    "Venue: Central Lawn");
            tv5.setText("Monika Gwalani : +91-7790893061\n" +
                    "Shivani Soni : +91-8764029764\n" +
                    "Arpit Dadhich : +91-7725969141\n" +
                    "Ishanvi Modi : +91-8764029764");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdZJY52twcL5ItyRC9h3vzcQou0LtWr44Phm2FXgMtNnq7BbQ/viewform?c=0&w=1"));
                    startActivity(i);             }
            });



        }
        else if(SplashContent.a==18){
            tv1.setText("\"Every day is a fashion show and the world is your runway\"\n" +
                    "Channel step into the world of fashion. This is your moment into spotlight, Strut down the ramp and strike up a pose, let those cameras click and flick to capture you in the perfect combination of creativity, flamboyance and attitude.");

            tv2.setText("RULES\n"+"Team members - Max 16, Min 7 (Including Backstage Members).\n" +
                    "Duration of performance - Min 8(Eight) Minute, Max 12(Ten) Minute.\n" +
                    "The ramp will be I-shaped.\n" +
                    "Teams exceeding time limit will be negatively marked.\n" +
                    "The music CD and a pen-drive (both containing the music tracks) should be submitted at the help desk by 2:00 p.m. on the day of the event.\n" +
                    "Changing rooms will be allotted after reporting with the team.\n" +
                    "No extra time will be given for the introduction. Exceeding the time limit will result in negative marking.\n" +
                    "Please carry one stand by CD for any emergency.\n" +
                    "Usage of fire on the stage is prohibited and teams doing so would be disqualified.\n" +
                    "Backstage helpers should not exceed 3(Three) in number.\n" +
                    "Criteria for judgment\n" +
                    "Theme (if any)\n" +
                    "Costumes(creativity, relevance to the round)\n" +
                    "Walk\n" +
                    "Music\n" +
                    "Originality\n" +
                    "Coordination\n" +
                    "Choreography\n" +
                    "Each team is supposed to submit names of a pair who would represent their team for Mr./Miss contest.\n" +
                    "Mr./Miss Contest may comprise of some rounds(questionnaire,taskoriented,etc) which would be decided on the spot or based on judges demand.\n" +
                    "Participants must carry an IPod or MP3 player.\n" +
                    "Decision of the judges in all matters will be final and binding.");
            tv3.setText("Entry Fee : ₹1,800 (For teams, 7-16 members)\n" +
                    "\n" +
                    "1st Prize : Worth ₹ 28000 (including ₹ 20000 cash)\n" +
                    "2nd Prize : Worth ₹10000 (including ₹6000 cash)");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 7:00 PM to 10:00 PM\n" +
                    "Venue: Central Lawn");
            tv5.setText("Mehak Pandita : +91-7568736232\n" +
                    "Email : mpandita996@gmail.com");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdZJY52twcL5ItyRC9h3vzcQou0LtWr44Phm2FXgMtNnq7BbQ/viewform?c=0&w=1"));
                    startActivity(i);             }
            });

        }
       else if(SplashContent.a==19){
            tv1.setText("Rock’athon A perfect blend of the adrenaline rush of a battle, boisterousness of a mosh pit and rhapsodical music, ROCK’ATHON is the battle of bands organized by JECRC Foundation Jaipur which aims to promote the underground music scene in India.");

            tv2.setText("RULES\n"+"Each band will be given a max time of 17+5 mins including the sound check.\n" +
                    "Marks will be deducted if the band exceeds the allotted time limit.\n" +
                    "Each band will be provided with a standard drum kit including one ride & one hi-hat. The drummers must carry their extra drum cymbals.\n" +
                    "Use of slang words is strictly prohibited.\n" +
                    "The guitarists are advised to carry their own processors & adapters.\n" +
                    "Bands are required to mail their Band profile along with the video links of their performances at the email addresses provided.\n" +
                    "On the basis of the entries received, the top 6 bands will be selected to perform at the event.\n" +
                    "Bands can have a maximum of 8 members and no member can be a part of more than one bands.\n" +
                    "Decision of judges will be final & binding.\n" +
                    "Any team violating the above rules is subject to direct elimination.\n" +
                    "All participants are supposed to carry their valid ID cards with them.\n" +
                    "\n" +
                    "\n" +
                    "General information:\n" +
                    "Interested bands please send two of yours good quality videos of live performances & one recorded OC to undersigned. Also mention the names of the band members, contact number & email id of the band manager and Facebook profile link of the band. Selected bands will be notified via email or call. Last date for the entries of the respective event is 5th march 2017. Failing sufficient no. of entries, event will be cancelled and you will be notified about the same.");

            tv3.setText("Entry Fee : ₹1600 Per Team\n" +
                    "\n" +
                    "Prize Money for the winner is Rs. 20000 worth including cash prize of 14000.\n" +
                    "The best artists will be acknowledged and awarded with prizes worth Rs. 1000 each.");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 4:10 PM to 7:10 PM\n" +
                    "Venue: Central Lawn");
            tv5.setText("Sidhima Shekhawat : +91-8875148974\n" +
                    "Kanishka Goyal : +91-7597784231");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdZJY52twcL5ItyRC9h3vzcQou0LtWr44Phm2FXgMtNnq7BbQ/viewform?c=0&w=1"));
                    startActivity(i);             }
            });


        }
       else if(SplashContent.a==20){
            tv1.setText("Street theatre as a form of communication is deeply rooted in the Indian tradition. It is arguably the oldest form of theatre in existence.In recent times this form has been used to propagate social and political messages and to create an awareness amongst the masses regarding critical issues.\n" +
                    "\n" +
                    "It will be a great honour for us if you can take some time out from your busy schedule to come and participate in our fest!");

            tv2.setText("Street plays can be in Hindi or English.\n" +
                    "Time limit: 15 minutes. Markings will be deducted excedding time limit.\n" +
                    "Usage of abusive language is strictly prohibited and may lead to disqualification.\n" +
                    "Judges' collective decision will be final and binding.\n" +
                    "Use of any sort of hazardous element/prop is strictly prohibited.\n" +
                    "Performance should be confined within the Nuked area, as defined by the organizers\n" +
                    "No technical support will be provided.\n" +
                    "No props are allowed. Teams can use banners and posters.\n" +
                    " Teams are allowed to use musical props as Dholak, Flute or any other music instrument of their choice, but usage of mikes, lights, or other electrical instruments is not allowed.\n" +
                    "Team size:: 15-20 members including those handling music and minimum 5 members.\n" +
                    "No professional assistance is permitted, all team members should be certified students of the institute. Please bring along your identity cards\n" +
                    "Our college will provide free accommodation for the team members on the day of event.");
            tv3.setText("Entry Fee : ₹1,800\n" +
                    "\n" +
                    "1st Prize : ₹12,000 + ₹3,000 coupons\n" +
                    "2nd Prize : ₹5,500 + ₹1,500 coupons");

            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 03:30 PM to 06:30 PM\n" +
                    "Venue: A Block");

            tv5.setText("Divisha Sharma : +91-9414418748\n" +
                    "Aditya Johri : +91-9602636770\n" +
                    "Umangini Panwar : +91-7340300217\n" +
                    "Shreya Singh : +91-8107317388");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdZJY52twcL5ItyRC9h3vzcQou0LtWr44Phm2FXgMtNnq7BbQ/viewform?c=0&w=1"));
                    startActivity(i);             }
            });

        }
       else if(SplashContent.a==21){
            tv1.setText("Words of a poem are mightier than a sword”\n" +
                    "Poetry is the oldest form of literature and has a rich written and oral tradition. The poetry reflects diverse spiritual traditions within India. In particular, many Indian poets have been inspired by mystical experiences.\n" +
                    "ANUPRAS- The Kavi Sammelan, gives you a platform to showcase your expertise & proficiency in poetry.");

            tv2.setText("RULES\n"+"Individual entries will be allowed.\n" +
                    "Maximum of 5 min will be given to each candidate. Negative marking will bedone if one exceeds the mentioned time limit.\n" +
                    "Self-composed and original poems will be given preference.\n" +
                    "The poem should not contain any vulgarity or obscenity, if found the the Participant will be immediately disqualified.\n" +
                    "The decision made by the judges will be final.\n" +
                    "The poems based on current issues, engineering life, quoted with fun, satire and message will be given preference.");
            tv3.setText("For Prelims : ₹100\n" +
                    "For Finals : ₹300 (inclusive the prelims fees for selected candidates)\n" +
                    "\n" +
                    "1st Prize : ₹ 7000/ ( ₹ 3500- cash + ₹ 3500- worth coupons)\n" +
                    "2nd Prize : ₹ 4500( ₹ 2000- cash + ₹ 2500 worth coupons)");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 1:00 PM to 4:00 PM\n" +
                    "Venue: A-block Auditorium");
            tv5.setText("Akshat Trivedi\t: +91-8764116853\n" +
                    "Kishan Mangal : +91-9694605289\n" +
                    "Gaurav Gupta : +91-8764088661");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdZJY52twcL5ItyRC9h3vzcQou0LtWr44Phm2FXgMtNnq7BbQ/viewform?c=0&w=1"));
                    startActivity(i);             }
            });

        }

       else if(SplashContent.a==22){
            tv1.setText("Vinyl War is back and this time with a bang! Move along the music and start mixing the vibes with the songs because the best DJs will be in town for a three hour rocking mania.");

            tv2.setText("RULES\n"+"Each contesting DJ will be given 12 + 3 minutes of play time.\n" +
                    "Each contestant is required to bring his laptops (in case he/she does not want to use the console) with pre-loaded software (Virtual DJ etc.).\n" +
                    "Any contestant using pre loaded play lists (on laptops) would be disqualified immediately.\n" +
                    " Judges will award points to the participant on the following factors of originality:\n" +
                    "Looping Live\n" +
                    "Running MixesScratching\n" +
                    "Equalization and balance of sound output\n" +
                    "Selection of tracks.\n" +
                    "Live remixes\n" +
                    "Crowd interaction\n" +
                    "Rapping\n" +
                    "Body language\n" +
                    "Attitude\n" +
                    "DJ’s Using turn tables need to carry their own cartridges.\n" +
                    "Any Participant playing only CD's should change a minimum of 4CD's/ Songs during his set in the given time.\n" +
                    "Any DJ using less than 4 CDs must include 2 Vinyl’s in his/her set.\n" +
                    "Participants will not be allowed to use PREMIXED Mixes in any format in the contest.\n" +
                    "Note: - For any further queries or specialized requirements kindly mention it at the Time of registration. (At least 2 hours before the commencement of the event).");

            tv3.setText("Entry Fee : ₹1,200\n" +
                    "\n" +
                    "First Prize: 15000/- ( 10000/- cash INR + 5000/- worth coupons) \n" +
                    "Second Prize: 9000/- ( 5000/- cash INR + 4000/- worth coupons)");
            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 06:45 PM to 9:45 PM\n" +
                    "Venue: Central Lawn");
            tv5.setText("Dixank Dwivedi : +91-9509249899\n" +
                    "Vishal Jain\n" +
                    "Suryanshi Adaniya\n" +
                    "Surbhi shriwastav\n" +
                    "Arpit Gupta");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdZJY52twcL5ItyRC9h3vzcQou0LtWr44Phm2FXgMtNnq7BbQ/viewform?c=0&w=1"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==23){
            tv1.setText("Footloose is back and this time with a bang! So lose yourself in this three phase freestlyle dance competition and let your passion sway your body to the rhythm. Flaunt the knack of your dance and get ready to conquer the stage with your sizzling moves.");


            tv2.setText("Round 1\n" +
                    "Happy feet- The Showcase\n" +
                    "\n" +
                    "\n" +
                    "Footloose is an open showcase event.\n" +
                    "Time will be 45 seconds.The dancers should bring their own 45 sec track (in cds,pendrive).\n" +
                    "The dancers should bring their own portable music system for practice.\n" +
                    "Originality of the dance will be encouraged as well as interaction & contacts with the spectators & the other dancers.\n" +
                    "Dancers are not restricted from performing any move but they must be aware that it is their own responsibility to ensure that they do not perform dangerous moves that could injure themselves or others.\n" +
                    "The use of fire works is not allowed.\n" +
                    "Round 2\n" +
                    "Provocation- Random Song challenge\n" +
                    "\n" +
                    "\n" +
                    "20 dancers will be selected from 1st round.\n" +
                    "There will be a random song challenge.\n" +
                    "Time will be 1 min 30 sec.\n" +
                    "Marking in this round will be done on the basis of quality of moves & synchronization with music.\n" +
                    "Round 3\n" +
                    "Bop Till You Drop- Prop Mania\n" +
                    "\n" +
                    "\n" +
                    "10 dancers will be selected from 2nd round.\n" +
                    "Time will be 2 min.\n" +
                    "There will be a random song prop challenge.\n" +
                    "Marking in this round will be done on the basis of quality of moves & synchronization with music.\n" +
                    "In case of any dispute, the decision of Judges will be final.");

            tv3.setText("Entry Fee : ₹200 per person\n" +
                    "\n" +
                    "1st Prize :- ₹4,000 + vouchers worth ₹2000\n" +
                    "2nd Prize :- ₹2,500 + vouchers worth ₹1500\n" +
                    "3rd Prize :-₹1,500 + vouchers worth ₹1000\n" +
                    "\n" +
                    "The rest 7 participants from the top 10 will get vouchers worth 500 each.");

            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 5:00 PM to 07:30 PM\n" +
                    "Venue: Quadrangle A-Block");
            tv5.setText("Sarthak Behl : +91-8854888441\n" +
                    "Meghna Vaishnav : +91-9950215425\n" +
                    "Ankit Dwivedi : +91-7742607119");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdZJY52twcL5ItyRC9h3vzcQou0LtWr44Phm2FXgMtNnq7BbQ/viewform?c=0&w=1"));
                    startActivity(i);             }
            });

        }

       else if(SplashContent.a==24){
            tv1.setText("Words make you think. Music makes you feel. A song makes you feel a thought.Singing is in our gene and in human nature.Singing brings happiness whether you want to do it for fun or professionally.So take your inner singer out, leap and be a part of what \"RAGA NIGHT\" has to offer. So grab the opportunity and showcase your singing talent!");

            tv2.setText("RULES\n"+"It is a solo singing competition.\n" +
                    "Event comprises Eliminations followed by Finals.\n" +
                    "The contestant will have to perform an Indian song of his/her choice in the first round.\n" +
                    "The contestants will also be tested on sense of scale and beat.\n" +
                    "No accompanists are allowed.\n" +
                    "Prelims will be held on March 8th, 2017 from 9 a.m. onwards.\n" +
                    "Only limited number of participants would be allowed and the criteria would be on the first come first registered basis.\n" +
                    "Any rendition must be a film song/album song.\n" +
                    "Criteria for judgement\n" +
                    "Selection of song\n" +
                    "Co-ordination with music\n" +
                    "Overall impact\n" +
                    "Quality of Singing\n");
            tv3.setText("Entry Fee : ₹300\n" +
                    "\n" +
                    "1st Prize : ₹6000+4000(Kinds)\n" +
                    "2nd Prize : ₹3000+3000(Kinds)");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 4:30 PM to 6:30 PM\n" +
                    "Venue: Central Lawn");
            tv5.setText("Kapil Pandey: +91-8233141967\n" +
                    "Janhavi Agarwal : +91-7221834576\n" +
                    "Sapna Gohrani : +91-9413994477");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdZJY52twcL5ItyRC9h3vzcQou0LtWr44Phm2FXgMtNnq7BbQ/viewform?c=0&w=1"));
                    startActivity(i);             }
            });


        }


       else if(SplashContent.a==25){


            tv1.setText("Just C is an event based on C programming language. It will provide you a platform to test and enhance your programming skills. It will be conducted by HackerEarth (an online competitive platform). For more info, check event’s Facebook page");

            tv2.setText("Two rounds will be conducted.\n" +
                    "\n" +
                    "Round 1 \n" +
                    "1. Each participant has to participate individually. \n" +
                    "2. Each participant has to solve multiple choice questions. \n" +
                    "3. Time duration will be of 45 min. \n" +
                    "4. Only the shortlisted candidates of this round will be eligible for Round 2, which is the final round. \n" +
                    " Round 2 \n" +
                    "1. This round will consist of coding questions ONLY. \n" +
                    "2. Candidates are required to program ONLY in C language. No other language will be entertained. \n" +
                    "3. Candidates completing task in minimum time will be awarded. \n" +
                    "4. Decision of the judges will be final.");
            tv3.setText("Entry Fee : ₹100 per candidate.\n" +
                    "\n" +
                    "1st Prize : ₹Rs. 5,000/- cash prize.\n" +
                    "10 Consolation prizes of Rs. 500/- each.");

            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 9:30 AM to 3:30 PM\n" +
                    "Venue: CP1 to CP8, Block A");
            tv5.setText("Karan Singh : +91-9001308391\n" +
                    "Firoz Khan : +91-9001584686\n" +
                    "Ayush Garg : +91-7597140740\n" +
                    "Kapil Khandelwal : +91-8766101160\n" +
                    "Mohit Jain : +91-7073590355\n" +
                    "Daksha Humad : +91-7877822824");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }

       else if(SplashContent.a==26){

            tv1.setText("An event based on the theme based web, mobile app development. Participants have to prepare the app and have to show case their app in the front of panel of judges.");

            tv2.setText("RULES\n"+". Maximum 2 team members are allowed per team .Solo \n" +
                    "participation is also valid. \n" +
                    "2. A theme will be provided, and you have to build an app according to that theme. Theme will announced later. \n" +
                    "3. The event will be of 7 hour’s duration. \n" +
                    "4. Teams will be provided with refreshments during the event. \n" +
                    "5. Participating team can choose any platform out of these- Web or App Development.\n" +
                    "6. On the main day, they have to create the app or website under the event time .They may bring their own laptops if not they can also work on college provided system. \n" +
                    "7. They will be given a problem, challenge. \n" +
                    "8. During the event, questions may be asked to them regarding \n" +
                    "their application. \n" +
                    "9. Internet access will be provided. Judgement criteria (read all points carefully) \n" +
                    "1. Any programming language can be used. \n" +
                    "2. Uniqueness of idea .Innovation and creativity will be a major factor in decision. \n" +
                    "3. Clarity of concepts about programming. Person having good concepts will be preferred. \n" +
                    "4. Level of programming (Clarity in code, easy to understand. Proper usage of syntax and validations, security features. GOOD CODED C SOFTWARE>>BAD CODED E COMMERCE WEBSITE) \n" +
                    "5. User Interface and simplicity i.e. ease of use. \n" +
                    "6. Implementation and usage of developed app. The developed application should be useful and commercially viable. \n" +
                    "7. The successful completion of challenges given by the judges can be used as a tiebreaker.");
           tv3.setText("Entry Fee : ₹200 per team\n" +
                   "\n" +
                   "1st Prize : ₹2500\n" +
                   "2nd Prize : ₹1500");
            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 9:30 AM to 4:30 PM\n" +
                    "Venue: A-Block IBM Lab");
            tv5.setText("Atul Modi : +91-9460822240 \n" +
                    "Pushpendra Singh : +91-9828882078 \n" +
                    "Keshav Modi : +91-9414628611 \n" +
                    "Aman Jain : +91-8233298222 \n" +
                    "Prakhar Khandelwal : 91-7976592903");



            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });
        }

        else if(SplashContent.a==27){
            tv1.setText("A technical event involving concepts of Core JAVA only. The event will consist of 2 rounds. Rounds description is as follows:\n" +
                    "\n" +
                    "Round 1:\n" +
                    "MCQ Problems.\n" +
                    "30 MCQs problems\n" +
                    "Marking Scheme: 3 marks on correct answers and -1 on incorrect.Time Limit: 20 mins\n" +
                    "\n" +
                    "Round 2:\n" +
                    "Online Contest(HackerEarth) Timing : 75 mins. For more info, check event’s Facebook page");
            tv2.setText("RULES\n"+"One Computer would be provided to each team.\n" +
                    "Maximum 2 members per team.\n" +
                    "You will be allowed to code in Core JAVA only.\n" +
                    "The competition will take place through the online competitive websites (e.g. Hackerearth, hackerrank)\n" +
                    "50% of the total participants will be promoted to Second round on the basis of First round.\n" +
                    "The team who will top the leaderboard will be declared as winner.\n" +
                    "Programs will be verified by judges and their jurisdiction will be final.");
            tv3.setText("Entry Fee : ₹200 per team\n" +
                    "\n" +
                    "1st Prize : ₹3000\n" +
                    "2nd Prize : ₹2000\n" +
                    "3rd Prize : ₹1000");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 12:30 NOON to 2:30 PM\n" +
                    "Venue: IBM Lab");
            tv5.setText("Saurabh Modi : +91-9509088668\n" +
                    "Aditya Gurjar : +91-9928981600\n" +
                    "Abhishek Pandey : +91-7597867068\n" +
                    "Abhishek Sarawag : +91-9610616042\n" +
                    "Pranav Dua : +91-8739958037\n" +
                    "Ankur Jain : +91-8003207444");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
       else if(SplashContent.a==32){
            tv1.setText("An intriguing quiz that will test your rudimentary technical knowledge and enthrall you throughout with exciting and innovative rounds.");

            tv2.setText("Round 1- Jumbled words!\n" +
                    "1.) Participants will be given certain number ofjumbled words related to technical and non-technical field which has to be solved in limited time.\n" +
                    "2.) It will be a pen and paper test.\n" +
                    "3.) Marks will be allotted on the basis of correct answers and few teams will qualify for the next and final round of the game.\n" +
                    "Round 2- The Taboo!\n" +
                    "1.) The objective of the game is for one player to have their partners guess the word on the players card without using the word itself. That word will be the forbidden word known as the taboo word.\n" +
                    "2.) Participants, if fail to guess, can pass and move on to the next word.\n" +
                    "3.) Winner of the game will be decided on the basis of maximum correct answers in specific time.");

            tv3.setText("Entry Fee : ₹150\n" +
                    "\n" +
                    "1st Prize : ₹3000\n" +
                    "2nd Prize : ₹1000");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 9:30 AM to 12:00 PM\n" +
                    "Venue: Venue: C- 401");
            tv5.setText("Nikita Gaur : +91-7597394087 \n" +
                    "Himani Sharma : +91-8440956575\n" +
                    "Lokesh Soni : +91-9829571189\n" +
                    "Asmita Goswami : +91-7297905935\n" +
                    "Amit Agarwal : +91-8094556013");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }

        else if(SplashContent.a==28){


            tv1.setText("Spiritual Research Cell is a novel initiative to uplift the virtues and to build up \n" +
                    "the moral muscle of the to-be engineers. It is the perfect place to nurture the \n" +
                    "inner-self with power of meditation. \n" +
                    "‘Enlightenment’ is a three hour workshop specially designed for young \n" +
                    "explorers who embark on journey of self-discovery. Come with us on this \n" +
                    "journey inside to explore, to experience and enjoy a precious part of you that \n" +
                    "remains hidden unless visited. This journey will create path ways for you into a \n" +
                    "future that is rich with happiness and success.");
            tv2.setText("In this exciting 3-hr workshop you will get a chance to: \n" +
                    "1. Clarify your understanding on Meditation \n" +
                    "2. Get familiar through Audio-Visual Meditation \n" +
                    "3. Experience live Meditation Session \n" +
                    "4. Rejuvenate through pat therapy \n" +
                    "5. Be a lucky winner to know your Bio-age through Karada-scan & for live demonstration of Human Aura Scanning and its analysis \n" +
                    "6. Involve in activity to experience Thought PowerRegistration for first come first serve. \n" +
                    "2. Limited 25 seats. \n" +
                    "3. Participants must carry passes during the event. \n" +
                    "4. Participants must reach 15 mins before the commencement of workshop. \n" +
                    "5. Certificates will be issued only if full 3hr workshop is attended.");
            tv3.setText("Entry Fee : ₹100\n" +
                    "\n" +
                    "Two lucky winners will get opportunity of Karadascan & Aura Scanning.\n" +
                    "\n");
            tv4.setText("Date: 9th and 10th March, 2017\n" +
                    "Time: 9:30 AM to 12:30 PM\n" +
                    "Venue: Wisdom hall, Spiritual Research Cell, Near BH-1, JECRC");
            tv5.setText("Gaurav Trivedi \n" +
                    "Rishika Agarwal \n" +
                    "Arush Maski \n" +
                    "Akash Damotiya \n" +
                    "Ritika Safaya");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });



        }

        else if(SplashContent.a==29){
            tv1.setText("First time ever in JECRC.A competition is designed for students to display and enhance skills in PC assembling with great precision and speed. Participants will demonstrate their ability to follow instructions to put together a PC using the right components and tools until it has started to successful boot.");

            tv2.setText("1. Two participants per team allowed. Participants will have to assemble the computer from the available components \n" +
                    "2. Participants must carry their ID cards with them. \n" +
                    "3. Participants must reach 15 minutes before commencement of the event. \n" +
                    "4. Team that will take least time in assembling will win. \n" +
                    "5. Care should be taken that given hardware is handled properly.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹5000\n" +
                    "Consolation prizes\n" +
                    "\n");

            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 9:30 AM to 3:30 PM\n" +
                    "Venue: CP5 , A block");
            tv5.setText("Ramashish Tomar : +91-8005889345 \n" +
                    "Utkarsh Mundra : +91-8764397750 \n" +
                    "Astha Koul : +91-8003746646.");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }

       else if(SplashContent.a==30){
            tv1.setText("EMBRYO - A National level paper presentation contest where different Scientific & Technical researches ignited with innovative ideas meet under the same shed. A mode of enhancing the doors to explore different technologies flavored with the stage skills of individual giving them an opportunity to think and helps in bringing out professionalism. So, gather your research, proliferate your energy and get ready for EMBRYO-2K17.");
            tv2.setText("RULES\n"+"1. First stage involves submitting paper(IEEE format) of about 500 words at embryo2k17@gmail.com before 26 th February. Entries shortlisted will be called to present their paper in RENAISSANCE’17 at JECRC campus on 8 th March. \n" +
                    "2. Maximum 2 students per team are allowed to present a paper, both member must be present at the event. \n" +
                    "3. The decision of judges will be final and binding. \n" +
                    "A. Presentation should be in .ppt or .pdf format. \n" +
                    "B. Time for one presentation will be 5-7 minute, one buzzer will rung after 5 minute to remind of time and the participant have to conclude the presentation in a total of 7 minutes. \n" +
                    "C. The papers will be judged on the basis of their innovation, in depth knowledge of the field and presentation skills.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹3000\n" +
                    "2nd Prize : ₹2000\n" +
                    "\n");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 11:0AM to 4:00PM\n" +
                    "Venue: CS-401,C-Block");
            tv5.setText("Kamakhya Bansal – 7413029001 \n" +
                    "Priyanshu Gupta – 8239919466 \n" +
                    "Ishmeet Kaur – 8058468569 \n" +
                    "Aman Agrawal – 8946912785 \n" +
                    "Akshay Jain – 9983543400");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });


        }

        else if(SplashContent.a==31) {

            tv1.setText("“NEW VENTURE” is the annual Business Plan competition organized by E-Cell JECRC. \n" +
                    "The event looks for ideas that bridge the divide between a need and the marketplace. The event is judged by a panel of been-there-done-that entrepreneurs, ANGEL’s, SEED FUNDERS and legal experts.\n" +
                    "\n" +
                    "3 PHASE OF NEW VENTURE\n" +
                    "\n" +
                    "1. ONLINE REGISTRATION\n" +
                    "Register your team and tell us about your idea.\n" +
                    "\n" +
                    "2. TOP 10 B-PLAN SHORTLISTED\n" +
                    "If you got selected, you will get mentored.\n" +
                    "\n" +
                    "3. FINAL ROUND \n" +
                    "Showcase your b-plan in front of investors at our campus.");
            tv2.setText("RULES\n" + "Participants are required to register and submit b plan online.\n" +
                    "Length- Maximum of 1 pages.\n" +
                    "Submission should contain the name of the business, team members and the institution.\n" +
                    "File should be saved as a PDF with the name ‘NewVenture_team name’.\n" +
                    "Submissions should be mailed to edc@jecrc.ac.in on or before 03rd March,2017 (11:59PM).\n" +
                    "The subject line of the e-mail should read as ‘NewVenture_TeamName’.\n" +
                    "Submissions received after the above mentioned date would not be considered.\n" +
                    "Participants from different colleges in a team is allowed.\n" +
                    "A team can have one or more members with a maximum of 3 in a team.\n" +
                    "Only one submission per student is allowed.\n" +
                    "WHY TO TAKE PART?\n" +
                    "1. There's a chance of getting SEED FUND\n" +
                    "2. PRIZE MONEY : Winner- Rs. 10000/-\n" +
                    "3. Consolation prizes worth Rs. 3000/-\n" +
                    "4. INVESTORS AND MARKETING TEAM\n" +
                    "\n" +
                    "PHASES OF NEW VENTURE\n" +
                    "1) ONLINE REGISTRATION : Register your team and tell us about your idea(i.e.The abstract)!!!\n" +
                    "2) TOP B-PLANS TO BE SHORTLISTED : Shortlisted teams will present their ideas in front of the investors");
            tv3.setText("Entry Fee : ₹400\n" +
                    "\n" +
                    "1st Prize : ₹10,000\n" +
                    "5 Consolation prizes worth ₹3000/-");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 10:00 AM to 2:00 PM\n" +
                    "Venue: C 401");
            tv5.setText("Radhika Sharma : +91-7891538238\n" +
                    "Anisha Goyal : +91-9784016561\n" +
                    "Arpita Jalori : +91-9785107067\n" +
                    "Ronak Patni : +91-7597344484\n" +
                    "Shubham Khandelwal : +91-8290395377\n" +
                    "Anjali Agarwal : +91-7727900245S\n" +
                    "Samarth Tholia : +91-7568088929\n" +
                    "Shubham Serva : +91-9024886356");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);
                }
            });

        }

           else if(SplashContent.a==33){
                tv1.setText("As the name itself explains “Best Out of Waste”. This is an event in which participants are suppose to make anything to their creativity from the waste products given to them. We will be providing them with the materials from which they need to make any 3D model. To highlight the importance of 3R’s i.e reduce, reuse & recycle for a better future.");

                tv2.setText("RULES\n"+"Maximum 2 members in a team.\n" +
                        "Use of any kind of mechanical or electrical things and waste materials other than provided is strictly prohibited.\n" +
                        "Participants must reach half an hour prior to the commencement of the event.\n" +
                        "The model created must consist 70% of waste.\n" +
                        "The judge’s decision will be final and cannot be challenged.");
                tv3.setText("Entry Fee : ₹100\n" +
                        "\n" +
                        "1st Prize : ₹1500\n" +
                        "2nd Prize : ₹800\n" +
                        "\n");
                tv4.setText("Date: 11th March, 2017\n" +
                        "Time: 3:30 PM to 6:30 PM\n" +
                        "Venue: C Block");
                tv5.setText("Sukanya Sharma: +91-9119301141\n" +
                        "Prabhad Saraswat : +91-7297926655");



                tv6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                        startActivity(i);             }
                });


            }

            else if(SplashContent.a==34){
                tv1.setText("The event here explores the understanding of AutoCAD. This event will be conducted in two rounds. First round comprising the questions based on basic AutoCAD knowledge followed bysecond round in which participants will have to draw the plan of dimensions provided.");

                tv2.setText("General Rules:\n" +
                        "it is an individual Participant's event.\n" +
                        "Participant will have to work on AutoCAD 2010\n" +
                        " Use of any other electronic device is strictly progibited.\n" +
                        "Judges digital will be final can't be argued.");
                tv3.setText("Entry Fee : ₹100\n" +
                        "\n" +
                        "1st Prize : ₹1500\n" +
                        "2nd Prize : ₹800\n" +
                        "\n");
                tv4.setText("Date: 8th March, 2017\n" +
                        "Time: 2:00 PM to 4:30 PM\n" +
                        "Venue: CP- 18 C Blocks");
                tv5.setText("Chandan Chandravanshi : +91-703589862\n" +
                        "Durgesh Kumar : +91-9829992126\n" +
                        "Ashish Singh : +91-9785578585");

                tv6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                        startActivity(i);             }
                });

        }

        else if(SplashContent.a==35){
            tv1.setText("The event here explores the basic civil engineering knowledge. This event is a quiz competition comprising of three rounds. First round will be having multiple choice questions followed by second round which is a buzzer round and then a target round which will be having questions from yearly syllabus only.");
            tv2.setText("RULES"+"A team can consist of maximum 2 paticipants.\n" +
                    "Use of mobile phones, calculator or any other electrical accessories is prohibited.\n" +
                    "All forms must be submitted to “www.tinyurl.com/jecrc-manthan” before the dead line.\n" +
                    "The judge’s decision will be final and can’t be argued.");
            tv3.setText("Entry Fee : ₹150\n" +
                    "\n" +
                    "1st Prize : ₹2000\n" +
                    "2nd Prize : ₹1000\n" +
                    "\n");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 12:30 PM to 4:30 PM\n" +
                    "Venue: C Block - CG 06");
            tv5.setText("Himanshu: +91-9649379551\n" +
                    "Jasveer : +91-8696784154");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }


       else  if(SplashContent.a==36){
            tv1.setText("The event here explores the creativity of participant and his/her understanding off the structure by implementing simple theories of structure and a little mathematics. In this event, participants have to construct a bridge of given dimensions using popsicle sticks.");

            tv2.setText("Maximum 3 members in a team.\n" +
                    "Adhesice and 200 popsicle sticks will be provided on the spot.\n" +
                    "It is not mandatory to use all the popsicle sticks.\n" +
                    "Use of material other than given is not permitted.\n" +
                    "The organizer have all the rights to change any rule at any point of the event.\n" +
                    "Dimensions : Lendht(span)- 50 cm \n" +
                    "Clearance - 5cm on each side \n" +
                    "Width- 10 cm\n" +
                    "limiting to an error of 2 cm in width & 4cm in length\n" +
                    "The bridge that meets the above constraints and dimensions supporting maximum weight at center will be declared as the winner \n" +
                    "Efficeincy Ratio: Load takesn/weight of the bridge");
            tv3.setText("Entry Fee : ₹250\n" +
                    "\n" +
                    "1st Prize : ₹3000\n" +
                    "2nd Prize : ₹2000");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 11:00 AM to 2:00 PM\n" +
                    "Venue: Basket Ball Court");
            tv5.setText("Hansraj Togara: +91-9001687626\n" +
                    "Mohit Sharma : +91-8385947312");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }

        else if(SplashContent.a==37){
            tv1.setText("The event here explores the creativity and understanding of the structure. In this event, participants have to construct a structure of roof and floor standing more or less permanently in one place provided props.");
           tv2.setText("General Rules:\n" +
                   "The participating team must not comprise of more than 3 persons.\n" +
                   "Use of props other than provided is prohibited.\n" +
                   "Use of supports is however allowed\n" +
                   "Participants must carry their own pair of ruler, scissors or any other cutting tool.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹2000\n" +
                    "2nd Prize : ₹1500\n" +
                    "\n");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 9:30 AM to 12:30 PM\n" +
                    "Venue: In Front Of C Block");
            tv5.setText("Neha Akhter : +91-9610663606\n" +
                    "Ahsan Ullah : +91-9690766389\n" +
                    "Vikram Sharma : +91-9928510318");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });
        }

        else if(SplashContent.a==38){
            tv1.setText("The Event is all about the creativity that one can portray beautifully on the drawing sheet/ cardboard. In this event participants have to convey the messages through drawings on different themes(Environmental issues, Save Girl Child, Modernisation).");
            tv2.setText("1. Interested participant can participate individually or in a team of two.\n" +
                    "2. Participants have to bring their own drawing materials as per their requirements.\n" +
                    "3. Decision of Judges will be final and cannot be challenged or questioned.");
            tv3.setText("Entry Fee : ₹100\n" +
                    "\n" +
                    "1st Prize : ₹1000\n" +
                    "2nd Prize : ₹800");
            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 9:30 AM to 1:30 PM\n" +
                    "Venue: MD (CE LAB)");
            tv5.setText("Poorna: +91-7597925257\n" +
                    "Radhika: +91-7062622845");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });
        }

        else if(SplashContent.a==39){
            tv1.setText("Build your Drone to travel from source to destination crossing various interruptions,hurdles, etc., along the path of journey. This is an open event for all (but should not be from any industry or a professional).");
            tv2.setText("General Rules:\n" +
                    "The Drone Copter will be evaluated with various stages of designing, construction,implementation of innovation and flying.\n" +
                    "Each and every part will be observed for judging which includes the connection of various parts, fixing of components, materials used, how the stuff is implemented, etc.\n" +
                    " The timer will start from the moment the countdown finish.\n" +
                    "The timer will stop only when the drone finally comes to start zone.\n" +
                    "The electric voltage anywhere in the machine should not be more then 12V DC at any point of time.\n" +
                    "The organizers reserve the rights to change any or all of the above rules as they deem fit.Change in rules, if any will be highlighted on the website and notified to the registeredteams.\n" +
                    " Violation of any of the above rules will lead to disqualification.\n" +
                    "Decisions of judges will be final and binding on all.\n" +
                    "Participants will be responsible for damage to their drones.\n" +
                    "\n" +
                    "Machine Specifications:\n" +
                    " Minimum Dimension: 30cm x 30cm x 10cm\n" +
                    " Maximum Dimension: 100cm x 100cm x 30cm.\n" +
                    " Machines should be powered/propelled by non\u00AD hydrocarbon engine.\n" +
                    " Teams can bring not only Drones but other flying machines as mentioned Zeplin, Co\u00AD axial chopper, Tail rotor chopper, Quadrotor, Hexapod, Tripod and Octacopter.\n" +
                    " If you have a drone that does not fit within the above specifications or is in some way ambiguous or borderline, please contact the event organizers.\n" +
                    "\n" +
                    "Competition Stages and Elimination rounds\n" +
                    "Round 1\n" +
                    "The goal will be for the Drone copter to takeoff from a specific location and land withinthe boundary of a predetermined circular landing crossing various hurdles in a time limitof 3 min.\n" +
                    "The performance will be evaluated basis the time taken from takeoff to landing within thespecified circle.\n" +
                    "Teams unable to complete this task or completing task in much more time (compared toother teams) will go through elimination.\n" +
                    "During this stage the teams will be given a maximum of two attempts for take-off andlanding.\n" +
                    "Round 2\n" +
                    "This stage meets the perfection in the stability of the Drone Copter.\n" +
                    "During this stage the Drone Copter has to travel through the gaps in the various hurdles.This is a time sensitive round and a maximum of two attempts will be provided. The circuit needs to be completed without avoiding any of the hurdles.\n" +
                    "The hurdles difficulty level will be higher than elimination round.\n" +
                    "The team completing all the above tasks in minimum time with more accuracy will be the winner.");
            tv3.setText("Entry Fee : ₹500\n" +
                    "\n" +
                    "1st Prize : ₹5000\n" +
                    "2nd Prize : ₹3000");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 1:30 PM to 4:30 PM\n" +
                    "Venue: GH LAWN");
            tv5.setText("Dipanshu Sharma : +91-9772750018\n" +
                    "Dushyant Marothia : +91-7742434323\n" +
                    "Garvit Chugh : +91-9772758587\n" +
                    "Manav Sharma : +91-9828373549\n" +
                    "Nikhil Goyal : +91-9549378353\n" +
                    "Aarushi Singh : +91-9828014663");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==40){
            tv1.setText("For all who have passion in Robotics or Sports, RENAISSANCE͛17 presents ͚Robo soccer. This competitions to show how good and swift robot of yours can be by playing soccer using it and scoring more goals.");
            tv2.setText("General Rules:\n" +
                    "1. The robot will get input signals wired/wireless from outside the arena.\n" +
                    " 2. Only one team member can control one robot throughout the event. So, at one time, only two team members will be controlling the robots.\n" +
                    " 3. No ready made components should be employed in making the robot. (Except controllers)\n" +
                    " 4. If any team is found harming the arena, the team will be disqualified on the spot.\n" +
                    " 5. In case of wireless robot, it should contain its own power supply of 12V. ROBO SOCCER RENAISSANCE͛17 7\n" +
                    " 6. DC Power supply of 12V, 2A will be provided by the IGNUS Team (Power Adapters).\n" +
                    " 7. Our team will not be responsible for any damage done to the robot in the arena.\n" +
                    " 8. our team will not be responsible for the noises created due to same frequencies in wireless\n" +
                    " communication between two teams during game.\n" +
                    " 9. Teams have to be present on scheduled time and delay won't be entertained.\n" +
                    " 10.In case of any discrepancies, the decision of the event coordinators will be final.");
            tv3.setText("Entry Fee : ₹500\n" +
                    "\n" +
                    "1st Prize : ₹5000\n" +
                    "2nd Prize : ₹3000\n" +
                    "\n");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 11:30 AM to 3:30 PM\n" +
                    "Venue: A block Quadrangle");
            tv5.setText("RISHABH ANAND : +91-9660792263\n" +
                    "MAYANK GUPTA : +91-8426094295");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==41){

            tv1.setText("\"CASH THE ASH\", In this event students have to develop a working model from the available components of a non working or discarded device according their innovative idea. Creating is not finding of a thing but making something out of it after it is found so get your mind work to create something innovative from the ASH.");
            tv2.setText("Participants will have to redesign and invent a working model from non-working projects or things not being utilized per their choice this may be their own (any non-working device at their home).\n" +
                    "Participants will demonstrate their working model on the event day.\n" +
                    "The teams are expected to make necessary arrangements for demonstration of the working model.\n" +
                    "Judges may change and add the rule and guidelines on day of event.\n" +
                    "The decision of the judges will be final.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹3000\n" +
                    "2nd Prize : ₹2000");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 9:30 AM to 3:30 PM\n" +
                    "Venue: Electronics Workshop");
            tv5.setText("Prashant Jha : +91-9799953278\n" +
                    "Ravi Ranjan Pathak : +91-7062424606\n" +
                    "Prachi Khandelwal : +91-8739969517\n" +
                    "Abhimanyu : +91-8385052586\n" +
                    "Shambhavi : +91-7240689577\n" +
                    "Kunal Soni : +91-8955936536");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==42){
            tv1.setText("Renovator is a technical event that falls right into the core of engineering. It emphasis on the basic circuits that are involve in the course of engineering. It also disperses light onto the innovation and creativity. Show cases your imagination with circuits to redesign by searching the missing components. The right or wrong selection may lead to new functioning of the circuit.\n" +
                    "To make it simple, the event consist of two rounds, first about the identification of circuit elements and second about the design of already studied circuit");
            tv2.setText("1.Combatant is a technical event comprising of 3 rounds.\n" +
                    "2.Number of participants in each team is 2-3.\n" +
                    "3.First round will be objective type quiz on the fundamentals of electrical and electronics and aptitude.\n" +
                    "4.After the round-1 all selected team go to round-2 and in round-2 the participants will try to solves the puzzles & design a working circuit which will be from basic electrical and electronics .That will be given on the spot.\n" +
                    "5.In the final and third round the teams will have to solve the given circuit design problem.Winner will be judged on the basis of accuracy of the result and presentation of the circuit design.Decision of judges and the conducting authority will be final.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹2500\n" +
                    "2nd Prize : ₹1500");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 12:30 PM to 3:30 PM\n" +
                    "Venue: Communication Lab (BG-04)");
            tv5.setText("Sanjay Kumar Jain : +91-9982216768\n" +
                    "Raveena Shrama : +91-8385917061\n" +
                    "Rohit Verma : +91-7597628111\n" +
                    "Ronak Khandelwal : +91-9983632868\n" +
                    "Nikita Agarwal : +91-9983632868\n" +
                    "Neha Kumari : +91-8696759896");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==43){
            tv1.setText("Task:\n" +
                    "Teams must build a manually controlled machine which can run on the track provided with minimum time.\n" +
                    "The bot can be wired or wireless. In case the participants use wireless mechanism, they must use dual frequency remote.\n" +
                    "Arena:\n" +
                    "The arena consists of the following:\n" +
                    "Track filled with pebbles, sand, water, spikes, soil, etc.\n" +
                    "Five ramps, with inclination of 20 degrees and 30 degrees.\n" +
                    "Semi cylindrical shaped hurdle of diameter 500 mm.\n" +
                    "Note:\n" +
                    "The dimensions of the arena will be accurate to within 5% or 20mm, whichever is less.\n" +
                    "The diameter of the pipe may vary within +/- 10 mm.\n" +
                    "\n" +
                    "CHECK TRACK HERE\n" +
                    "The arena may be slightly different.\n" +
                    "\n" +
                    "Bot Specifications:\n" +
                    "The dimensions of the bot should be less than or equal to 300 mm X 300 mm X 300 mm ,failing which the team will be disqualified from the competition.\n" +
                    "The bot should be controlled manually.\n" +
                    "Teams can use both wired as well as wireless control mechanisms. In case of wired bots, the length of wire should be minimum 2 meters so that the wire remains slack at any instant of time. If the participants use wireless mechanism then it is mandatory to use a dual frequency remote.\n" +
                    "The dimensions of the remote are not included in the size constraint of the bot.\n" +
                    "Bot can have an on-board or off-board power supply.\n" +
                    "Irrespective of the mechanism used, only one person will be allowed to control the bot.\n" +
                    "Power Supply:\n" +
                    "The participants can use an on-board or off-board electric power supply. However the power source must be non-polluting and must satisfy the safety constraints determined by the organizers.\n" +
                    "The voltage between any two points should be less than or equal to 24V DC at all times during the run.\n" +
                    "In case of off-board power supply, participants have to manage on their own.\n" +
                    "Gameplay:\n" +
                    "The bot must start from the START line.\n" +
                    "There are 10 Test Modules in the track.\n" +
                    "Each Test Modules has specified points, viz.\n" +
                    "Test Modules 1 (Durability test): 30 points.\n" +
                    "Test Modules 2 (Torque test): 30 points.\n" +
                    "Test Modules 3 (Speed test): 40 points.\n" +
                    "Test Modules 4 (Friction test): 40 points.\n" +
                    "Test Modules 5 (Brake test): 50 points.\n" +
                    "Test Modules 6 (Gravity test): 50 points.\n" +
                    "Test Modules 7 (Time test): 60 points.\n" +
                    "Test Modules 8 (Water Resistance test): 60 points.\n" +
                    "Test Modules 9 (Acceleration test): 70 points.\n" +
                    "Test Modules 10 (Stability test): 70 points.\n" +
                    "The bot has to cross each level in the given order only.\n" +
                    "If bot is not able to cross a particular level then it can skip that level.\n" +
                    "Maximum number of skips allowed is THREE, failing which will result into disqualification.\n" +
                    "Points of the skipped levels will not be counted.\n" +
                    "It is a time based game, the timer will start when the bot starts running from the START point.\n" +
                    "The timer will not stop while skipping process.\n" +
                    "The timer will count till bot reaches the FINISH point.");
            tv2.setText("Game Rules:\n" +
                    "The machine would be checked for its safety before the run and will be disqualified if found unsafe for other participants.\n" +
                    "Only two team members are allowed to enter in the arena, however only one member is allowed to control the bot. Other team members are not allowed to enter the arena.\n" +
                    "The bot will be liable for disqualification if it causes any kind of damage to the arena.\n" +
                    "In case the bot gets stuck at any place and at any point of time for more than 10 sec, then the bot will be placed back to the initial start position of that Level .The timer won’t be stopped during this process.\n" +
                    "Maximum of 8 minutes will be given for each team for completing the track.\n" +
                    "General Rules:\n" +
                    "The teams must adhere with the spirit of healthy competition.\n" +
                    "Organizers reserve the right to disqualify any team indulging in misbehavior or violating any rules.\n" +
                    "Any team that is not ready at the specified time will be disqualified from the competition automatically.\n" +
                    "The time measured by the organizers will be final and will be used for scoring the teams.\n" +
                    "Time measured by any contestant by any means will not be accepted for scoring.\n" +
                    "In case of any disputes/discrepancies, the organizers' decision will be final and binding.\n" +
                    "The organizers reserve the rights to change any or all of the above rules as they deem fit. Change in rules, if any will be announced before the gameplay.\n" +
                    "Note that at any point of time, the latest information will be that which is given on the day of event. The information provided in the PDF downloaded earlier may not be the latest. However, registered participants will be informed before the game play.\n" +
                    "All decisions taken by the organizing team will be final. No argue will be encouraged.\n" +
                    "Scoring:\n" +
                    "Points will be awarded for crossing individual levels as given above.\n" +
                    "Total points for completing track will be 500 points without any skip.\n" +
                    "In skip, equivalent point is added in the participant track completion time as penalty time.\n" +
                    "Total score = Total points + Number of seconds left from 480 seconds (Number of seconds will be accounted only if the bot has crossed the FINISH line).\n" +
                    "The team with maximum points will be the winner.\n" +
                    "Team Specification:\n" +
                    "A team may consist of a maximum of 5 members. Students from different educational institutes can form a team.\n" +
                    "\n" +
                    "Eligibility:\n" +
                    "All students with a valid identity card of their respective educational institutes are eligible to participate in the event.\n" +
                    "\n" +
                    "Certificate Policy:\n" +
                    "Top two teams will be rewarded and given prizes.\n" +
                    "Certificate of participation will be given to all the teams.");
            tv3.setText("Entry Fee : ₹500\n" +
                    "\n" +
                    "1st Prize : ₹5000 + Goodies\n" +
                    "2nd Prize : ₹3000 + Goodies");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 12:30 AM to 4:00 PM\n" +
                    "Venue: Quadrangle A-Block");
            tv5.setText("Jitendra Sharma: +91-9251642109\n" +
                    "Aashutosh Modi: +91-9772019008");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });
        }
        else if(SplashContent.a==44){
            tv1.setText("If the sound of an engine is your daily music and mechanics your religion, we invite you to show the extent of your passion. Let these mind blowing machines hit the track and fight out in the most diverse conditions .They must find their way through several turns while the clock ticks away.");
            tv2.setText("A team may consist of a maximum of 4 members.\n" +
                    "The robot would be checked for their safety before the run and would be discarded if found unsafe for other participants and spectators.\n" +
                    "Participants should not dismantle their robots before the completion of the whole competition as the robots might need to be verified by the judges at a later stage to ensure that the participants have not violated any of the rules.\n" +
                    "Judges' decision shall be treated as final and binding on all.\n" +
                    "The organizers reserve the right to change any or all of the above rules as they deem fit. Change in rules, if any, will be highlighted on the website and notified to the registered participants.\n" +
                    "\n" +
                    "Bot Specification:\n" +
                    "Each team is allowed to have only one bot.\n" +
                    "The bot must fit into a cube of dimensions 25cm * 25cm * 25cm.\n" +
                    "The bot must use only on\u00ADboard power supply. No external off\u00ADboard power supply is allowed.\n" +
                    "The max voltage difference between any two points must not exceed 12V\n" +
                    "The bot must be fully autonomous with all powering and motoring mechanisms self contained.\n" +
                    "Any manual (by switch) or wireless input is not allowed after turning on the power supply.\n" +
                    "Human operators are not permitted to enter any information into the bot during the event.\n" +
                    "\n" +
                    "Arena Specification:\n" +
                    "The competition platform has been designed with a white line on a black surface. The bot will have to move on this line. The line width will be 3.0 cm.\n" +
                    "Note: Track will be revealed during the event.\n" +
                    "\n" +
                    "Scoring:\n" +
                    "Complete task in minimum time with clearing all the checkpoints.");
            tv3.setText("Entry Fee : ₹500\n" +
                    "\n" +
                    "1st Prize : ₹5000 + Goodies\n" +
                    "2nd Prize : ₹3000 + Goodies");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 9:30 AM to 12:30 PM\n" +
                    "Venue: B-301");
            tv5.setText("Mithlesh Yadav: +91-7877217118\n" +
                    "Chitrangana Singh : +91-7611898897");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });
        }
        else if(SplashContent.a==45){
            tv1.setText("Robowar is a combat robotics championship, where two custom-build machines use varied methods of destroying or immobilising the other. Robowar promises to be an ultimate battlefield where the bots fight for life and the survival is the only victory. Build the fiercest, meanest, toughest and strongest bot to pave your way through the arena and defeat the opponent in this one-on-one combat.");
            tv2.setText("TEAM SPECIFICATIONS AND ELIGIBILITY\n" +
                    "\n" +
                    "Eligibility: Students of any recognized engineering college are eligible to participate.\n" +
                    "\n" +
                    "Team Specification: Any team can participate in Robowar. A team may consist of a maximum of 6 participants. These participants can be from same or different institutes.\n" +
                    "\n" +
                    "BOT SPECIFICATIONS\n" +
                    "\n" +
                    "Dimensions and Fabrications:\n" +
                    "The machine should fit in a box of dimensions 750mm x 750mm x 1000 mm (l x b x h) at any given point during the match. The external device used to control the machine or any External tank is not included in the size constraint.\n" +
                    "The machine should not exceed 60 kg in weight including the weight of pneumatics source/tank. Weight of power source device(battery,transformer,adapter) excluded.\n" +
                    "\n" +
                    "\n" +
                    "Power Sources:\n" +
                    "The machine can be powered electrically only. Use of an IC engine in any form is not allowed.\n" +
                    "Each team must prepare its own power sources. Only 220V volt AC sources will be provided at the arena, but can only be used in the form of DC voltage. The teams have to bring their own battery eliminators.\n" +
                    "The voltage difference between any two points in the machine should not be more than 36V DC at any point of time.\n" +
                    "All connections should be made safe to prevent short circuits and battery fires. Any unsafe circuitry may be asked to be replaced; failure to do so will result in disqualification.\n" +
                    "Use of damaged, non-leak proof batteries may lead to disqualification.\n" +
                    "Change of battery will not be allowed during the match.\n" +
                    "It is suggested to have extra batteries ready and charged up during competition so that on advancing to next level, you don't have to wait or suffer due to uncharged battery. If teams don't show up on allotted slot, they will be disqualified.\n" +
                    "\n" +
                    "\n" +
                    "Mobility:\n" +
                    "All robots must have clearly visible and controlled mobility mechanism in order to compete.\n" +
                    "Methods of mobility may include:\n" +
                    "Rolling (wheels, tracks or the whole robot).\n" +
                    "Walking (linear actuated legs with no rolling or cam operated motion).\n" +
                    "Shuffling (rotational cam operated legs).\n" +
                    "Jumping and hopping is not allowed.\n" +
                    "Flying (using aerofoil, helium balloons, ornithopters, etc.) is not allowed.\n" +
                    "Any other method of mobility which leads the robot to lose contact with the ground is not allowed.\n" +
                    "\n" +
                    "\n" +
                    "Robot control requirements:\n" +
                    "Both wired and wireless remote controls are allowed in the event.\n" +
                    "All wires coming out of the robot should be bundled as a single unit.\n" +
                    "The wires should be properly protected and insulated.\n" +
                    "The wire should be sufficiently long so as to remain slack at all time during the competition.\n" +
                    "In case of wireless remote controls, the remote should have at least two frequency operations to prevent interference with other team.\n" +
                    "Teams are recommended to attach a pipe to bot in vertical direction through which wires come out. The length of pipe will not be considered in bot dimension.\n" +
                    "\n" +
                    "\n" +
                    "Pnumatics and hydraulics:\n" +
                    "The robot must use non-inflammable and non-corrosive fluids to power pneumatic and hydraulic devices.\n" +
                    "Maximum pressure in the tank containing pneumatic fluid should not exceed the limit of 8 bars and there should be a provision to check the pressure in the tank.\n" +
                    "All hydraulic liquids are required to be non-corrosive and your device should be leak proof. The maximum pressure in cylinder should not exceed the rated pressure at any point of time.\n" +
                    "Participants must be able to indicate the used pressure with integrated or temporarily fitted pressure gauge.\n" +
                    "You must have a safe way of refilling the system\n" +
                    "All pneumatic components on board a robot must be securely mounted. Care must be taken while mounting the pressure vessel and armour, to ensure that if ruptured it will not escape the robot.\n" +
                    "\n" +
                    "\n" +
                    "Victory Criteria\n" +
                    "\n" +
                    "A robot is declared victorious if its opponent is immobilized.\n" +
                    "A robot will be declared immobile if it cannot display satisfactory motion of at least 6 inch in a timed period of 30 seconds.\n" +
                    "In case both the robots remain mobile after the end of the round then the winner will be decided subjectively.\n" +
                    "A robot that is deemed unsafe by the judges after the match has begun will be disqualified and therefore declared the loser. The match will be immediately halted and the opponent will be awarded a win.\n" +
                    "If two or more robots become entangled or a crushing or gripping weapon is employed and becomes trapped within another robot, then the competitors should make the timekeeper aware, the fight should be stopped and the robots separated by the safest means.\n" +
                    "Therefore declared the loser. The match will be immediately halted and the opponent will be awarded a win.\n" +
                    "Robots cannot win by pinning or lifting their opponents. Organizers will allow pinning or lifting for a maximum of 20 seconds per pin/lift then the robots will be instructed by the organisers to release. If, after being instructed to do so, the attacker wants to release but does not, their robot may be disqualified. If two or more robots become entangled or a crushing or gripping weapon is employed and becomes trapped within another robot, then the competitors should make the timekeeper aware, the fight should be stopped and the robots separated by the safest means.\n" +
                    "\n" +
                    "\n" +
                    "General Rules\n" +
                    "\n" +
                    "There will be three rounds of two and half minutes each.\n" +
                    "Any team that is not ready at the time specified will be disqualified.\n" +
                    "In no case should the arena be damaged by any bot. The competition will be played on a knock-out basis.\n" +
                    "A BOT will be declared 'KNOCKED-OUT' if it is unable to travel a distance of 6 inches in 30 seconds.\n" +
                    "If no bot is immobilized then winner will be declared on the basis of the points scored.\n" +
                    "The organizers reserve the rights to change any or all of the above rules as they deem fit. Change in rules, if any will be highlighted on the website and notified to the registered teams.\n" +
                    "Violation of any of the above rules will lead to disqualification.\n" +
                    "Decision of organizers will be final and binding on all.\n" +
                    "\n" +
                    "\n" +
                    "Safety Rules\n" +
                    "\n" +
                    "Compliance with all event rules is mandatory. It is expected that competitors stay within the rules and procedures of their own accord and do not require constant policing.\n" +
                    "Special care should be taken to protect the on-board batteries and pneumatics, robot without proper protection will not be allowed to compete.\n" +
                    "If you have a robot or weapon design that does not fit within the categories set forth in these rules or is in some way ambiguous or borderline, please contact the event organizers. Safe innovation is always encouraged, but surprising the organizers with your brilliant exploitation of a loophole may cause your robot to be disqualified before it even competes.\n" +
                    "Each event has safety inspections. It is at their sole discretion that your robot is allowed to compete. As a builder you are obligated to disclose all operating principles and potential dangers to the inspection staff.\n" +
                    "Proper activation and deactivation of robots is critical. Robots must only be activated in the arena, testing areas, or with expressed consent of the event coordinators.\n" +
                    "All weapons must have a safety cover on any sharp edges.\n" +
                    "All participants build and operate robots at their own risk. Combat robotics is inherently dangerous. There is no amount of regulation that can encompass all the dangers involved. Please take care to not hurt yourself or others when building, testing and competing. Any kind of activity (repairing, battery handling, pneumatics systems etc.) which may cause damage to the surroundings during the stay of the teams in the competition area should not be carried out without the consent of organizers. Not following this rule may result in disqualification.\n" +
                    "All the resources provided at the time of competition from the organizers should be strictly used only after the consent of the organizers.\n" +
                    "Once the robots should enter into the arena, no team member can enter into the arena at any point of time. In case if a fight has to be halted in between and some changes have to be done in the arena or condition on the robot(s), it will be done by organizers only\n" +
                    "\n" +
                    "NOTE: Qualification of a robot to next level is subjective and totally on the decision of the judges. A robot winning in a round against its opponent doesn’t guarantee its entrance into the next round. If the judges found the winner robot incompetent to enter into the next round, it may get disqualified. Judges can disqualify both the robots of a match from advancing to the next round.");

            tv3.setText("Entry Fee : ₹500\n" +
                    "\n" +
                    "1st Prize : ₹10,000 + Goodies\n" +
                    "2nd Prize : ₹5,000 + Goodies\n" +
                    "\n");
            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 11:00 AM to 4:30 PM\n" +
                    "Venue: Quadrangle A-Block");
            tv5.setText("Date: 10th March, 2017\n" +
                    "Time: 11:00 AM to 4:30 PM\n" +
                    "Venue: Quadrangle A-Block");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });





        }
        else if(SplashContent.a==46){
            tv1.setText("The event is to develop research activity among students. Participants will try to match results of research papers in given prescribed time. The participants in the next level will have to draft abstract and title of another research paper. The shortlisted participant will have to present a Power point presentation of the same paper in the next level.");
            tv2.setText("1. The event consists of three rounds. First round is online round where as the other two rounds are offline. \n" +
                    "2. Open for all branches. \n" +
                    "3. Use of internet is permitted for first round only. Duration of first round is around two weeks. \n" +
                    "4. Round 2 and 3 will be conducted on 11 th March, 2017. \n" +
                    "5. Decision of the judges will be final. \n" +
                    "Rules for Round 1 – \n" +
                    "1. Teams have to simulate a portion of the paper given to them in specified number of days. \n" +
                    "2. Participating teams can opt the research interest from list of areas specified. \n" +
                    "3. A research paper will be allotted as per their research area. \n" +
                    "4. First round has no elimination but the credits will be added in round two for the elimination.\n" +
                    " Rules for Round 2 \n" +
                    "1. Teams will be given a research paper and they have to write the abstract and title for it. \n" +
                    "2. Selected teams will move to the next round. \n" +
                    "3. Time period- (1.5hr)\n" +
                    " Rules for Round 3 – \n" +
                    "1. The teams will be provided with facilities to prepare power point presentations for their research papers within duration of one hour. \n" +
                    "2. Each team will be given 10 minutes to present the presentation and handle the queries. \n" +
                    "3. Participants will be evaluated on the basis of communication skills, content and handling of queries.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹2000\n" +
                    "2nd Prize : ₹1500");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 9:30 AM to 1:30 PM\n" +
                    "Venue: MAT LAB B-BLOCK GROUND FLOOR (BG-09)");
            tv5.setText("AISHWARYA SHARMA : +91-7891504055\n" +
                    "ADITYA SHARMA : +91-9413288087\n" +
                    "AMIT KUMAR : +91-7073319621\n" +
                    "ANUSHKA AGARWA : +91-9024726376");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==47){
            tv1.setText("A quiz is more than just a collection of questions in search of answers. It is a reflection of the times we live and have lived in. The event presents a medley of well gleaned technical questions to test the intellectual capabilities. If Archie was the first and backrub became Google, the advent of search engines and internet has meant that answers to anything are just a click away.");
            tv2.setText("1. The event has four rounds. \n" +
                    "2. Maximum number of participants per team is two. \n" +
                    "3. In first round 20 questions will be provided. \n" +
                    "4. The elimination of teams depends on the cut off decided by the judges. \n" +
                    "5. A chit will be drawn from the pot which will consist of three questions. \n" +
                    "6. The students will be given 2 minutes time to solve the three questions. \n" +
                    "7. The participants who qualify in round two will appear for next round. \n" +
                    "8. Round three is a visual round. \n" +
                    "9. In round for the top five teams will be participating, which will be buzzer round. \n" +
                    "General Rules\n" +
                    "1. Use of calculators, mobiles and other electronic gadgets is strictly prohibited. \n" +
                    "2. Team members can be from different colleges and branches and years.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹2500\n" +
                    "2nd Prize : ₹1500\n" +
                    "\n");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 12:30AM to 4:30PM\n" +
                    "Venue: LT, CAD LAB");
            tv5.setText("Harshil Jain : +91-8094592266 \n" +
                    "Manmeet Kaur : +91-7073587937 \n" +
                    "Arpit Singhal : +91-8426040666 \n" +
                    "Ajay Agarwal : +91-7727989894 \n" +
                    "Aneesh Ansari : +91-9455108610");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==48){
            tv1.setText("When you want to know how things really work, study them when they're coming apart.William Gibson, Zero History Techno InBuzz is a Technical poster presentation. This is the presentation of research information or an idea with an academic or professional focus on a poster. For any professional, communicating his/her idea efficiently determines his success professionally. The primary motive of this competition is to enhance the ability to deliver a visual presentation without any other audio/video aids. This event basically focuses on the creativity of the students. Here in Renaissance we provide you a platform to showcase your innovation, creativity, knowledge, and ability to tackle queries.");
            tv2.setText("Team size should not be more than three. \n" +
                    "2. Each team must come along with their prepared posters. \n" +
                    "3. The themes can be selected from the underlined : Electronics & Electrical Mechanical & Civil Computer Science & Information Technology Basic Sciences \n" +
                    "4. The size of poster should be of following dimensions A1 (23.4 x 33.1 in) size. \n" +
                    "5. Judges will evaluate the posters on given criteria like creativity, future aspects and Presentation and queries. \n" +
                    "6. The judges will short list teams for second round. \n" +
                    "7. Second round will be the Blaze round (rapid fire) consisting of questions related to their Creative design. \n" +
                    "8. Top scorer will be announced as Winner and runner up. \n" +
                    "9. The decision of the judges will be final and cannot be questioned.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹3000\n" +
                    "2nd Prize : ₹2000\n" +
                    "\n");
            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 9:30AM to 11:30PM\n" +
                    "Venue: B-Block Foyer");
            tv5.setText("Aditya Gautam : +91-8764249905 \n" +
                    "Ashish John : +91-9414422690 \n" +
                    "Aditya Vardhan : +91-9462963842 \n" +
                    "Ankit Sankhla : +91-9636733796 \n" +
                    "Ashish Agarwal : +91-8560813164 \n" +
                    "Ayush Jain : +91-9462178437");



            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });


        }
        else if(SplashContent.a==49){
            tv1.setText("This Embryo is aiming to tap the minds of budding mechanical engineers. In this regard, we have enclosed the poster of the Embryo. The events like paper presentation in the symposium helps students to think and come up with innovative ideas ,also enhancing the on stage skills of the students Few events challenging the students ability apart from academic proficiency, helps in bringing out professionalism and volunteeringtraits from the individuals.");
            tv2.setText("1. The first stage involves the uploading of abstracts online \"manishsrivastava.me@jecrc.ac.in\". The entries selected for the second round are required to present their paper at JECRC JAIPUR during RENAISSANCE-17.\n" +
                    "2. Participants from different institutions can also form a team.\n" +
                    "3. A maximum of 2 students per team are allowed to present a paper. In case of team participation, both the members are required to be present at the time of the event.\n" +
                    "4. The decision of the judges will be final and binding. Guidelines:\n" +
                    "1. Presentations should be in .ppt or .pptx format.\n" +
                    "2. For the presentations, a LCD projector, a computer, a mike and speakers will be provided.\n" +
                    "3. The time for one presentation will be 5-7 minutes. One buzzer will be rung after 5 minutes to remind the participants about the time and final buzzer will be rung after 7 minutes.\n" +
                    "4. Any extension in the allotted time will result in the loss of points.\n" +
                    "5. No request regarding change in schedule and date of paper presentation will be entertained under any circumstances.The papers will be judged on the basis of their innovation, in depth knowledge of the field and presentation skills. The decision of the judges will be final and binding.");
            tv3.setText("Entry Fee : ₹100\n" +
                    "\n" +
                    "1st Prize : ₹2500\n" +
                    "2nd Prize : ₹1500");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 11:00 AM to 4:00 PM\n" +
                    "Venue: C-401");
            tv5.setText("Shahjade Alam : +91-8947910251\n" +
                    "Dhruv Laddha : +91-7597923778\n" +
                    "Devendra : +91-8107632175\n" +
                    "Shahrukh Khan : +91-8562075358");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==50){
            tv1.setText("Fork lifter is about building a crane using wooden material suitable enough to place the given weights on a platform using only hydraulic mechanism.");
            tv2.setText("1. Crane should be made of wooden material. The weight of the crane should not exceed 5 kilograms. \n" +
                    "2. No additional support should be provided in any way. \n" +
                    "3. The crane should works on hydraulic mechanism only. Locomotion of any part of the machine should be powered by hydraulic force (you can move the syringe by hand if required). \n" +
                    "4. The crane should be controlled by fluid containing syringes. \n" +
                    "5. Use of batteries and other power sources is prohibited. \n" +
                    "6. Only Adhesives (Synthetic white adhesive or single component cyano-acrylate adhesive) can be used to build the structure. Use of M-Seal and Cello-tape is prohibited. Use of threads is permitted. Ice-cream/pop-sickle sticks can be stacked to make stronger elements.Round 1: In this round points will be given to each crane on the basis of maximum weight it can lift for 5 sec. Points of this round will be added in the final score.Round 2: In this round teams will be given a task to perform, the task will be of picking up blocks andplacing them on the specified location.Round 3: \n" +
                    "• Selected teams will have to build a building with blocks in given time \n" +
                    "• Point will be given on basis of height and stability of building. \n" +
                    " General Rules: \n" +
                    "1. The maximum time of 5 minutes is given to each team to lift as much weight as they can. \n" +
                    "2. Team members are not allowed to touch any part of crane, except the controlling syringes. So they should be mounted separately. \n" +
                    "3. Maximum of 4 members per team is allowed. Maximum of two people will be allowed to control the machine at any point of time. \n" +
                    "4. Use pin joints only. \n" +
                    "5. The organizers reserve all rights to change any of the above rules as they deem fit. Change in rules, if any will be highlighted on the website. \n" +
                    "6. In case of any discrepancy the decision of the judges will be final and binding to all.");
            tv3.setText("Entry Fee : ₹250\n" +
                    "\n" +
                    "1st Prize : ₹2500\n" +
                    "2nd Prize : ₹1500");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 12:30 PM to 3:30 PM\n" +
                    "Venue: B-BLOCK FOUNTAIN");
            tv5.setText("Girish Khandelwal : +91-7737833541 \n" +
                    "Raushan Kumar : +91-8440980043 \n" +
                    "Om Prakash Yadav : +91-7062756792 \n" +
                    "Prince Kumar : +91-9828941454 \n" +
                    "Shubham Wadhwa : +91-9116490811 \n" +
                    "Vikash Jain : +91-8058406306");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==51){
            tv1.setText("In this event participant challenged to design 3-D object on AutoCAD.");
            tv2.setText("Stage I:\n" +
                    "It is divided into two parts.\n" +
                    "Quiz (15 question/15 marks/10 min.)\n" +
                    "2D-drawing (1 drawing/25 marks/30 min.)\n" +
                    "\n" +
                    "\n" +
                    "Stage II:\n" +
                    "The student who qualifies 1st stage will only move to the second stage.\n" +
                    "Contestants will be given a 3D drawing and its all three views (F.V., T.V., S.V.) would have to be drawn with dimensions in 90 min. (60 marks)\n" +
                    "\n" +
                    "Final result will be declared on the basis of both stages.\n" +
                    "\n" +
                    "Evaluation Criteria:\n" +
                    "Time\n" +
                    "Accuracy\n" +
                    "\n" +
                    "\n" +
                    "Guidelines :\n" +
                    "It is individual participant’s event.\n" +
                    "No other accessories will be provided rather than Question Paper.\n" +
                    "No external electronic devices will be allowed.\n" +
                    "If system problem occurs, it will be short out at the time of event.\n" +
                    "Decision of judges will be final, cannot be argued.");
            tv3.setText("Entry Fee : ₹150\n" +
                    "\n" +
                    "1st Prize : ₹2000\n" +
                    "2nd Prize : ₹1000\n" +
                    "\n");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 2:00 PM to 4:30 PM\n" +
                    "Venue: BF-08 (Mechanical Cad Lab)");
            tv5.setText("Vivek Sharma-7737355997\n" +
                    "Shubham Rathi : +91-8890111910\n" +
                    "Dilip Jajoo : +91-8107424409\n" +
                    "Himanshu Guneshwar : +91-9460554144");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==52){
            tv1.setText("This event requires racing of your RC cars on a race track. Although it may look simple to you but you will face cut-throat competition, and finally it is the quality of the car and driver ability which will decide the winner.\n" +
                    "\n" +
                    "PROBLEM STATEMENT\n" +
                    "Build a Remote Controlled IC engine powered car to traverse a race track in the minimum possible time. The time track may be composed of several turns with increasing difficulty levels. The teams with the top best time to lap this track qualify for racing. Final round will be a race.");
            tv2.setText("General Rules:\n" +
                    "The team will have a maximum of 5 students.\n" +
                    "Teams would be given specific slots to practise in the arena. Teams are supposed to come during their practice slot and use the track. The slots will be given on a first come, first serve basis. Any request regarding extension of slots or exchange of slots will not be entertained.\n" +
                    "The teams must adhere to the spirit of healthy competition. The teams must not damage the opponent's machine in any way. Judges reserve the right to disqualify any team indulged in misbehaviour.\n" +
                    "The participants will have to submit the set of questions on their working model before the competition. Only the teams who have submitted this would be considered during the event in renaissance, 2017.\n" +
                    "The participants have to control their model car in the arena with the help of 2.4 GHz frequency remote control from a platform. Only one team member is allowed to be on the platform.\n" +
                    "No power supply would be provided.\n" +
                    "The teams are not allowed to leave any loose part(s) on the arena. If found, they would be immediately disqualified.\n" +
                    "The organizers reserve all rights to change any or all of the above rules. Change in any rule, if any, will be highlighted on the website.\n" +
                    "All rounds of the event will be held at JECRC during renaissance, 2017.\n" +
                    "If the car runs away from the track, topples or halts, the team member present on the arena can reset the car from the nearest check post. The member should keep the car behind the check post; time would be running during this.\n" +
                    "Teams are not allowed to damage the model car of other teams on or off the arena. If found doing so, the team would be disqualified. This will be subject to the judges’ discretion and would be final.\n" +
                    "The track will be an all-terrain track with sharp turns and big jumps. In this edition of Race, both speed and control will be important. The car should be able to cross bumps, rough patches on the track and out do the opponent’s car while maintaining its stability and not compromising with its pace. The track will be an off road track. Most parts of the track will be made up of mud and grass, however at a few places wood and or pebble like materials may be used to create obstacles.\n" +
                    "Despite organizer’s efforts to keep the track’s quality intact, the track is subjected to undergo wear and tear as machines run over it. The machine is expected to be able to perform on such a weakened track as well.\n" +
                    "Multiple machines will race on a single lane track at a time.\n" +
                    "A lap of the track is completed when the machine comes back to the start-finish line.\n" +
                    "round 1- technical inspection and qualifiers.\n" +
                    "round 2 - challenge round. race of 2 teams at a time.\n" +
                    "round 3 - semi finals.\n" +
                    "round 4- finals\n" +
                    "\n" +
                    "\n" +
                    "Machine Specification:\n" +
                    "Machine should fit in a box of dimensions 700mm x 500mm x 600mm at any moment of time during the race. The external device which is used to control the machine is not included in the size constraint.\n" +
                    "The machine should be controlled by a wireless remote control mechanism throughout the race.\n" +
                    "Maximum displacement of engine will be 4.5cc.\n" +
                    "Maximum percentage of nitro methane in fuel must be 20%.\n" +
                    "The machine parts may be roughly classified into structural and functional parts: Functional parts - Gears, differential gear, engine, springs, shock absorbers, servo motors (non propulsion purposes only), batteries, wheels and wheel hub can be directly used as available in the market. Structural parts - Chassis, steering mechanism, shock towers and suspension (excluding upper suspension arm, suspension spring and shock absorbers), if built by the participants themselves, extra points will be awarded.\n" +
                    "The tires must have a minimum diameter of 3 inch. You are advised to use tires of good width for better performance on dirt tracks.\n" +
                    "Brake Mechanism: It is compulsory to incorporate braking mechanism in the car. Any other part used in braking mechanism (including the brake disk).\n" +
                    "Steering Mechanism: Any part which is connected to steering rod rigidly i.e. has no degrees Susof freedom with respect to steering rod will be considered as part of steering rod.\n" +
                    "pension mechanism: Any part rigidly connected to suspension arms or one with no degrees of freedom with respect to suspension arm will be considered as its part. For example both the heim joint for the upper suspension arm and the stud rigidly connected to the wheel hub can be bought from the market.\n" +
                    "If there are parts used in the concerned joint which are neither rigidly connected with suspension or the hub, steering system or hub; they can be used ready - made from the market.");

            tv3.setText("Entry Fee : ₹1000\n" +
                    "\n" +
                    "1st Prize : ₹15,000\n" +
                    "2nd Prize : ₹10,000");
            tv4.setText("Date: 9th March, 2017(1st Round) and 10th March, 2017(2nd Round)\n" +
                    "Time: 9:30 AM to 3:30 PM and 9:30 to 12:30 PM respectively\t\n" +
                    "Venue: C-Block Lawn");
            tv5.setText("Mohit Pareek : +91-9782941104\n" +
                    "Rahul Gupta : +91-8561844204\n" +
                    "Govind Vyas : +91-9610488491\n" +
                    "Satyam Jain : +91-7737436129\n" +
                    "Gagan Jindal: +91-9602085058");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==53){
            tv1.setText("Propello is an event of making propulsion device with the use of compressed air.");
            tv2.setText("1. Maximum number of members in each team is 3.\n" +
                    "2. Material for construction will be provided on the spot.\n" +
                    "3. Participants have to construct the device within time limits.\n" +
                    "4. Judging will be done on the basis of the performance of the device.\n" +
                    "Guidelines: Propulsion rocket powered with the help of pressurised water. Judging will be done on the basis of time of flight, distance of path covered and trajectory of the device.");
            tv3.setText("Entry Fee : ₹250\n" +
                    "\n" +
                    "1st Prize : ₹2500\n" +
                    "2nd Prize : ₹1500");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 9:30 AM to 12:30 PM\n" +
                    "Venue: C-BLOCK LAWN");
            tv5.setText("Dinesh Kumar Jain : +91-7611048565\n" +
                    "Vishvendra kumar : +91-7014690417\n" +
                    "Nirankar Singh : +91-7732898891");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==54){
            tv1.setText("Do you think... You know everything about Automobile Engine. This event requires in depth knowledg about various components involved in the assembly of an Automobile Engine.");

            tv2.setText("This event is divided into two stages. In the first stage each team (Two Members) has to clear an objective type test paper, only the qualified teams will be allowed to enter in the second stage. In the second stage each team will be provided an Automobile Engine which they have to disassemble and then again assembleit to the original state. Detailed description of each stage is as follows:\n" +
                    "Round 1:\n" +
                    "1. This stage is to test the technical skills of the participants.\n" +
                    "2. Each team should answer 20 questions (objective type) each carrying 3 marks and 1 mark will bededucted for wrong answer.\n" +
                    "3. Duration: 15 minutes.Round 2:\n" +
                    "This Stage will be further divided into two phases i.e.Phase-1:\n" +
                    "1. An Automobile Engine and a tool kit will be provided to each team.\n" +
                    "2. Teams have to disassemble the Automobile Engine up to the last component, identify and note its components.\n" +
                    "3. Duration: 30 minutesPhase-2:\n" +
                    "1. In this phase teams have to assemble the Automobile Engine to the original state.\n" +
                    "2. Upon the completion of the task, a judge will test the knowledge of the participants and awardmarks.\n" +
                    "3. It should be clearly kept in mind that any damage caused to the device, no matter how insignificant,will lead to disqualification.\n" +
                    "4. Duration: 20 minutes");
            tv3.setText("Entry Fee : ₹150\n" +
                    "\n" +
                    "1st Prize : ₹2500\n" +
                    "2nd Prize : ₹1500");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 9:30 AM to 3:30 PM\n" +
                    "Venue: Badminton Court");
            tv5.setText("Mohit P.Saini : +91-9782291197\n" +
                    "Raja Janmejay : +91-9887520333\n" +
                    "Abhijeet Sharma : +91-9462120331\n" +
                    "Vijaykant gaur : +91-8561031898\n" +
                    "Arpit Jain : +91-9057972772");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==55){
            tv1.setText("A real test of engineering aptitude for the Mechanical Engineering students.");
            tv2.setText("1. This event is for JECRC students only.\n" +
                    "2. The participants must bring their smart phone for CBT.\n" +
                    "3. During the exam students are not allowed to leave the room for drinking water and any other services.\n" +
                    " Round 1: \n" +
                    "1. 50 Basic Mechanical Engineering questions are to be answered in 60 minutes \n" +
                    "2. For Ist year students the question paper will comprise of basic question from PCM \n" +
                    "3. 50% students will be qualified for the next round. \n" +
                    "4. The qualified students will be further divided as per their year of study. Round 2: \n" +
                    "1. 30 core Mechanical Engineering questions are to be answered in 30 minutes. \n" +
                    "2. For Ist year students the paper will comprise of basic engineering question \n" +
                    "3. Participation certificates will be given to every student who qualified the I st round.");
            tv3.setText("Entry Fee : ₹100\n" +
                    "\n" +
                    "1st Prize : ₹1500\n" +
                    "2nd Prize : ₹750 \n" +
                    "Consolation Prize: Rs. 300 (2 in Each Year)");
            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 12:30 AM to 3:30 PM\n" +
                    "Venue: BT-07 & BT-14");
            tv5.setText("Linkon Gori : +91-9462181912 \n" +
                    "Yogesh Yadav : +91-8559909689 \n" +
                    "Kuldeep Soni : +91-9929862949");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==56){
            tv1.setText("A test of knowledge, exclusively in Mechanical Engineering discipline as a competition between Individuals and Teams as a form of awareness.");
            tv2.setText("1. Only team (maximum of 3 person) entries are eligible.\n" +
                    "2. Maximum three teams from a college and total 10 teams will be registered for event.\n" +
                    "3. Audiences shall not give any hints or clues to the competitors.\n" +
                    "4. Decision of judges will be final and binding.\n" +
                    " ROUND 1: \n" +
                    " Stage-I: This round is paper round in which each team would be given a set of question paper containing 20 multiple choice, True/False, specific answer type questions are to be answered in 10 minutes. \n" +
                    "Stage-II [Rapid Fire Round]: Each team will be asked 10 questions one after another in five minute time. (2 marks for correct answer and 1 negative marks for wrong answer) \n" +
                    "• The score of Stage I and II will be added and top 8 teams would be selected for the Final Round. \n" +
                    " ROUND 2: \n" +
                    "Stage-I: \n" +
                    "• A question will be asked to a team and if they are unable to answer it will be passed to the next team. Answering time is only 15 seconds. \n" +
                    "(2 marks for correct answer, 1 negative mark for wrong answer and no marks if team pass the question to next team. ) \n" +
                    "Stage-II [Tech. Dumb Charades]: \n" +
                    "\uF0D8 Identify the object with the help of gesture. (2 marks for correct answer) Incase the team is not able to answer then the question would be passed to the audience. \n" +
                    "Stage-III [Buzzer Round]: \n" +
                    "• 10 questions would be asked. A question will be fired and the team who presses the buzzer first will answer (2 marks for correct answer and 1 negative mark for wrong answer). Unanswered/Wrong answered questions will be passed to audiences. \n" +
                    "• In case of tie between 2 or more teams, further 5 questions would be asked for final selection.");
            tv3.setText("Entry Fee : ₹300\n" +
                    "\n" +
                    "1st Prize : ₹2100\n" +
                    "2nd Prize : ₹1100 \n" +
                    "3rd Prize : ₹700");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 12:30 AM to 4:30 PM\n" +
                    "Venue: BT-07 & BT-14");
            tv5.setText("Jayesh Garg : +91-7665426077 \n" +
                    "Kanaram : +91-8386881879 \n" +
                    "Himanshu Rai : +91-9166170366 \n" +
                    "Pratyush : +91-9549938874 \n" +
                    "Manish sain : +91-9680357494");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==57){
            tv1.setText("IVSHOW has the main motto to read the speed of Engineers mind. In this regard, we have enclosed the Innovative video competition which named as IVSHOW. This event gives the platform to the students to show their hidden talent with engineering innovative videos collection and motivates the rest of the students to think to be innovative.");
           tv2.setText("RULES\n"+"1. Individual participation only. \n" +
                   "2. The Video will be judged on the basis of their innovation, in depth knowledge of the field and the \n" +
                   "decision of the judges will be final and binding. \n" +
                   "3. Video should be in HD format. \n" +
                   "4. The time for video presentation will be 5 minutes and for questions 2 minutes will be provided. \n" +
                   "5. Any extension in the allotted time will result in the loss of points. \n" +
                   "Guidelines: \n" +
                   "1. For the presentations, a LCD projector, a computer, a mike and speakers will be provided. \n" +
                   "2. Video should be relevant and belong to engineering field.");

            tv3.setText("Entry Fee : ₹100\n" +
                    "\n" +
                    "1st Prize : ₹1500\n" +
                    "2nd Prize : ₹1000\n" +
                    "\n");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 2:30 PM to 4:30 PM\n" +
                    "Venue: C-501");
            tv5.setText("Vivek Soni : +91-7792856564 \n" +
                    "Shubham Khandelwal : +91-9530031335 \n" +
                    "Parul Yadav : +91-7728820030 \n" +
                    "Suraj Prajapati : +91-9694565854 \n" +
                    "Prince Sharma : +91-9828941454");



            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });
        }
        else if(SplashContent.a==58){
            tv1.setText("The idea and concept that come here are simply awesome. Great platform for a bit fun and a bit play with tones of knowledge that you take away. This event will consist of two rounds. First one is objective questions round and second one is designing and testing of circuit on breadboard using various components.");
            tv2.setText("1. Maximum number of participants in a team is 3. \n" +
                    "2. Bring your college Id cards and receipt of participation on event day. \n" +
                    "3. Mobile phones and calculators are not allowed during the event. \n" +
                    "4. The teams will get 30 minutes for objective paper. \n" +
                    "5. The topics of the objective paper will be from basic electrical, aptitude and related streams. \n" +
                    "6. Person from the different colleges may be in the same team, but one person may not be a part of two teams in the same event. \n" +
                    "7. The decision of the judges will be final and no arguments will be entertained.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹1200\n" +
                    "2nd Prize : ₹800\n" +
                    "\n");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 12:30 PM to 3:30PM\n" +
                    "Venue: PE Lab ( EE Department , B Block)");
            tv5.setText("Aamir Sadik khan : +91-9024366147\n" +
                    "Aditya Sharma : +91-9571603402\n" +
                    "Arun Gahlot : +91-8114466747\n" +
                    "Chandraveer Singh Rathore : +91-8955721733");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==59){
            tv1.setText("In this event student will have to present a paper on a topic from electrical or electronics engineering.");
            tv2.setText("1. Maximum number of participants in a Team is 2. \n" +
                    "2. The topics of the papers need to be based on streams related to electrical and electronics engineering. \n" +
                    "3. Abstract should not exceed 300 words and Paper should not exceed 6-7 pages. \n" +
                    "4. The subject of the mail with the attached abstract and later. \n" +
                    "5. Bring your college I-Card & receipt on event day. \n" +
                    "6. Please bring your Power Point presentation in a pen-drive. \n" +
                    "7. Soft-copies of the submitted paper and PowerPoint presentations must be in the .docx format. \n" +
                    "8. Please Mail your abstract, paper and ppt to vishalsharma.ee@jecrc.ac.in Difficulties will be addressed through the same email-id. \n" +
                    "9. Please bring 01 hard copy of the submitted paper on the day of the event. \n" +
                    "10. The teams will get 10 minutes for presentation followed by question and answer session. \n" +
                    "11. Persons from different institutions can be a part of the same team. However, one person may not be a part of multiple teams for the same event. ");
            tv3.setText("Entry Fee : ₹100\n" +
                    "\n" +
                    "1st Prize : ₹1100\n" +
                    "2nd Prize : ₹750");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 11:0AM to 4:00PM\n" +
                    "Venue: Conference hall (A block)");
            tv5.setText("Akshita Mangal : +91-9460441766\n" +
                    "Harshit Jain : +91-8233437773\n" +
                    "Anurag Garg : +91-8058454802\n" +
                    "Shubham Agrawal : +91-7619726022\n" +
                    "Neha Gour : +91-9001247068\n" +
                    "Ayush Bhatnagar : +91-9571067121\n" +
                    "Nanika Gee Padha : +91-9610974442");




            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==60){
            tv1.setText("Quiz will be based on the Basic electrical, Basic electronics, Environment energy and ecology questions.");
            tv2.setText("There can be maximum of 4 and minimum of 2 members in a team. \n" +
                    "• There will be 4 rounds. \n" +
                    "• Teams not having cut off marks in each round will be eliminated. \n" +
                    "• In case of any tie there will be sudden death question where team giving correct answer will qualify for next round. \n" +
                    "• 1 st round will be visual round where questions will be displayed and students will have to answer them. \n" +
                    "• 2 nd round will be based on general and logical technical questions. \n" +
                    "• 3 rd round will be rapid fire round. \n" +
                    "• 4 th and final round will be buzzer round. \n" +
                    "• Team with maximum points after the end of 4 th round will be declared winner of the quiz. \n" +
                    "• In case of any conflict the decision of judges will be final. \n" +
                    "• Use of internet will be strictly prohibited. Any team found with this will be disqualified");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹1100\n" +
                    "2nd Prize : ₹700");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 12:30AM to 4:30PM\n" +
                    "Venue: EE Cad Lab, CP-15 (B-Block)");
            tv5.setText("Him Shikhar : +91-7062709998 \n" +
                    "Tushar Jain : +91-8561970403> \n" +
                    "Vipul Jain : +91-8502082322> \n" +
                    "Tanuj sukhpadia : +91-8058950867");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==61){
            tv1.setText("The extraordinary event aimed to discuss innovative technologies, ideas and projects that may find their business solutions in the cross border economy. If you have the passion to think out of the box which can evolve as a new technology then you’ve reached the right place i.e. \"CRAZY INNOVATORS\"");
            tv2.setText("ID card is mandatory. \n" +
                    "• Demonstration time is maximum 10 mins. \n" +
                    "• Build a small and nimble team ( 2 participants). \n" +
                    "• Decision of the judges will be final and will not be subjected to any further discussion \n" +
                    "• Registration fee is Rs 200 per team. \n" +
                    "• Open for all branches. \n" +
                    "• Spot entries are allowed. \n" +
                    "• Any act against the spirit of the event will lead to disqualification of the team.");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹2100\n" +
                    "2nd Prize : ₹1600");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 9:30AM to 12:30PM\n" +
                    "Venue: PE Lab , B- Block");
            tv5.setText("Aayushi Mukhija : +91-7023733082\n" +
                    "Aman Bansal : +91-7689045659\n" +
                    "Bharti Naraniya : +91-9352703037\n" +
                    "Mukul bhardwaj : +91-9414317133\n" +
                    "Uttam kumar : +91-7728040678\n" +
                    "Vivek");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==62){
            tv1.setText("AUMAGIC (Automatic process is a Technical Contest in which students compete for supremacy in the field of automation process in the industries. Automation processes are the part of manufacturing plants of different products. Automation process can be achieved with the help of relays also in the small Process Industries");
            tv2.setText("There may be maximum 4 students in one group. \n" +
                    "2. Each team will provide the name of automatic operation at the time of registration. \n" +
                    "3. Team is allowed to use one or more electromagnetic Relays. \n" +
                    "4. Microcontroller and PLC are not allowed to use. \n" +
                    "5. Relays, limit switches, sensors, push buttons, indicating lights, selector switches, alarms, horns, motors, solenoid valves can be used to make the operation. \n" +
                    "6. All the components are to be connected on wooden board \n" +
                    "7. Team has to perform an automation operation at the time of event. \n" +
                    "8. Registration will be open from 10/2/2017 to 24/2/2017. \n" +
                    "9. Registration fee is 200/ per group \n" +
                    "10. In case of any conflict the decision of judges will be final. \n" +
                    "11. ID card is mandatory");
            tv3.setText("Entry Fee : ₹200\n" +
                    "\n" +
                    "1st Prize : ₹2100\n" +
                    "2nd Prize : ₹1100\n" +
                    "\n");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 9:30AM to 12:30PM\n" +
                    "Venue: PE Lab , B- Block");
            tv5.setText("Romit Malav : +91-9460954765\n" +
                    "Prakash Bijarniya : +91-8003017483\n" +
                    "Sandeep Pareek : +91-7597589351\n" +
                    "Navjot singh : +91-8003044197\n" +
                    "Anju Shukla : +91-7062829517\n" +
                    "Neeraj Singla : +91-8764375636");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==63){
            tv1.setText("Q-Fiesta is an innovative science quiz having three different and interesting rounds like Dekh Bhai Dekh, Mein Bolta Tum Poochta & Dramebaz, in which very popular and interesting questions, theorems, reactions & principles from Physics, Chemistry, Maths & English would be asked.");
            tv2.setText("There will be 4 members in a team.\n" +
                    "Screening will be there on the basis of questioner.\n" +
                    "12 Teams will be selected for the first round.\n" +
                    "After first round three teams will be eliminated and threemore after second round.\n" +
                    "Team will be given one minute time to answer the question.\n" +
                    "In case of any discrepancy the decision of the judges would be the final decision.");
            tv3.setText("Entry Fee : ₹250 Per Team (4 Member)\n" +
                    "\n" +
                    "1st Prize : ₹2000\n" +
                    "2nd Prize : ₹1500\n" +
                    "\n");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 12:30 PM to 04:30 PM\n" +
                    "Venue: Seminar Hall (501) Block-C");
            tv5.setText("Harsh Sharma : +91-9252375955\n" +
                    "Mohit Shah : +91- 7737766135");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });


        }
        else if(SplashContent.a==64){
            tv1.setText("In this event the participant will present the things/ project/ techniques/ jugaad made up of waste materials. It should be an innovative fix for your business an improvised solution born from ingenuity and cleverness.");
            tv2.setText("Members in a team : 3 (Maximum)\n" +
                    "The jugaad will be judged in 4 different areas.\n" +
                    "Technique 10 marks\n" +
                    "Presentation 10 marks\n" +
                    "Innovation 10 marks\n" +
                    "Application 20 marks");
            tv3.setText("Entry Fee : ₹150\n" +
                    "\n" +
                    "1st Prize : ₹2000\n" +
                    "2nd Prize : ₹1000\n" +
                    "\n");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 3:30 AM to 6:30 PM\n" +
                    "Venue: In Front Of CG, CF Block-C");
            tv5.setText("Aakanksha Sharma : +91-9871066599\n" +
                    "Abhishek Agarwal : +91-9929245579");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });


        }
        else if(SplashContent.a==65){
            tv1.setText("Extempore is basically impromptu speech where a speaker is provided with a topic/picture to speak instantly i.e. on the spot. Here, a speaker can speak either for the motion or against the motion.");
            tv2.setText("There will be three rounds of one minute each");
            tv3.setText("Entry Fee : ₹100\n" +
                    "\n" +
                    "1st Prize : ₹2000\n" +
                    "2nd Prize : ₹1500");
            tv4.setText("Date: 9th March, 2017\n" +
                    "Time: 9:30 AM to 12:00 PM\n" +
                    "Venue: 401- Seminar Hall (C- Block) Level-4");
            tv5.setText("Shruti Shukla : +91-8854822110\n" +
                    "Ambuj Shukla : +91- 9461545859\n" +
                    "Prajjwal Joshi : +91-7737571623");



            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==66){
            tv1.setText("Pen it Down event is based on the fact that Every Picture tells a story. Pen it Down is a mouse down event. It shows the potential indulge in individual one for imagination, creativity, presence of mind with visual scenes. Observation of visual clippings creates the new story which should be so much frictional but show the real correlation.");
            tv2.setText("Number of Story Clips – 5\n" +
                    "Each Clip will contain 10 Scenes\n" +
                    "Total Marks – 50\n" +
                    "Time Period for Story Writing– ½ Hour\n" +
                    "Maximum Words – 800 - 1000\n" +
                    "Fees: Entry Fees:- Rs. 50/-");
            tv3.setText("Entry Fee : ₹50\n" +
                    "\n" +
                    "1st Prize : ₹1000\n" +
                    "2nd Prize : ₹500\n" +
                    "\n");
            tv4.setText("Date: 8th March, 2017\n" +
                    "Time: 12:30 PM to 03:30 PM\n" +
                    "Venue: IBM Lab - A Block");
            tv5.setText("Nitisha Agarwal : +91-7742410955\n" +
                    "Nirmal Lakhara : +91- 8829888910");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==67){


            tv1.setText("Posters are a key component of communicating science and an important element in a successful scientific career. This session will be a visual representation of given topic. Typically, participants will stand next to their display and will explain the poster along with the informal questions about their poster.");
            tv2.setText("Use A1 size sheet (23.4 x 33.1 in)\n" +
                    "visuals (graphs, photographs, schematics, maps, etc.) should be included with the text.\n" +
                    "Lettering Title: CAPS\n" +
                    "Topics: Green Campus Clean Campus, Energy Conservation, Save Environment, Sustainable Development\n" +
                    "Judgement - Content: 15 Marks, Presentation: 15 Marks, Queries: 10 Marks, Display: 10 Marks");
            tv3.setText("Entry Fee : ₹100\n" +
                    "\n" +
                    "1st Prize : ₹1000\n" +
                    "2nd Prize : ₹500\n" +
                    "\n");
            tv4.setText("Date: 10th March, 2017\n" +
                    "Time: 09:30 AM to 1:30 PM\n" +
                    "Venue: CG & CF Of Block C");
            tv5.setText("Hardeep Singh : +91-9649172521\n" +
                    "Mahipal Singh : +91- 8899791956");



            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/forms/ye4bioE1RtObvgho2"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==68){
            tv1.setText("The panelists discuss the issue or topic with each other by asking questions or reacting to the views and opinions of other panel members. A specific amount of time should be established. The leader or moderator closes the discussion and provides a summary of panel presentations and discussion.The topic for the discussion is (Demonetisation-A cure worse than the disease)");
            tv2.setText("RULES\n"+"Number of members in a panel will be six.\n" +
                    "The discussion will be moderated by the moderator.\n" +
                    "Use of abusive language will not be entertained.");
            tv3.setText("Entry Fee : NILL");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 01:30 PM to 3:00 PM\n" +
                    "Venue: Conference Hall Block-A");
            tv5.setText("Japleen Kaur : +91-9309393222\n" +
                    "Nidhi Agiwal : +91-8764006683\n" +
                    "Paridhi Sharma : +91-8114489399");
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfTjS8CThPHf21-UggKRhf_3trRuMd7T6DuD7CM44gyC5T3VQ/viewform?c=0&w=1&usp=send_form"));
                    startActivity(i);             }
            });




        }
        else if(SplashContent.a==69){
            tv1.setText("The session will be taken by'\n" +
                    "Mr. Dhruv Mehta(2013,ME)\n" +
                    "Financial Analyst, California Department of Insurance,USA");
            tv2.setText("RULES\n"+"NILL");
            tv3.setText("Entery fee\n"+"NILL");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 12:00 NOON-1:00PM\n" +
                    "Venue: Conference Hall (A Block)");
            tv5.setText("Sanya Khatri : +91-8561868161 \n" +
                    "Vaibhav Vijay : +91-9982267285");

            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfTjS8CThPHf21-UggKRhf_3trRuMd7T6DuD7CM44gyC5T3VQ/viewform?c=0&w=1&usp=send_form"));
                    startActivity(i);             }
            });

        }
        else if(SplashContent.a==70){
            tv1.setText("JECRC Alumni Association invites you to a fun filled Saturday at the ground, back with those stumps and bats which were once a part of your daily routine during those unforgettable cricket matches!\n" +
                    "Participation in this event is restricted to JECRC alumni; they are encouraged to bring their friends as players or as part of the cheering squad.");
            tv2.setText("RULES\n"+"Will be updated soon");
            tv3.setText("FEE\n"+"will be updated soon");
            tv4.setText("Date: 11th March, 2017\n" +
                    "Time: 1:00 NOON-3:30PM\n" +
                    "Venue: C Block Lawn");
            tv5.setText("Will be updated soon");


            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfTjS8CThPHf21-UggKRhf_3trRuMd7T6DuD7CM44gyC5T3VQ/viewform?c=0&w=1&usp=send_form"));
                    startActivity(i);             }
            });
        }

    }
    @Override
    public boolean onTouchEvent(MotionEvent touchevent) {
        float lastX = 0,currentX;
        switch (touchevent.getAction()) {
            // when user first touches the screen to swap
            case MotionEvent.ACTION_DOWN: {
                lastX = touchevent.getX();
                break;
            }
            case MotionEvent.ACTION_UP: {
                 currentX = touchevent.getX();

                // if left to right swipe on screen
                if (lastX < currentX) {

                    switchTabs(false);
                }

                // if right to left swipe on screen
                if (lastX > currentX) {
                    switchTabs(true);
                }

                break;
            }
        }
        return false;
    }
    public void switchTabs(boolean direction) {
        if (direction) // true = move left
        {
            if (tabHost.getCurrentTab() == 0)
                tabHost.setCurrentTab(tabHost.getTabWidget().getTabCount() - 1);
            else
                tabHost.setCurrentTab(tabHost.getCurrentTab() - 1);
        } else
        // move right
        {
            if (tabHost.getCurrentTab() != (tabHost.getTabWidget()
                    .getTabCount() - 1))
                tabHost.setCurrentTab(tabHost.getCurrentTab() + 1);
            else
                tabHost.setCurrentTab(0);
        }
    }

    @Override
    public void onBackPressed() {
        Intent i=new Intent(Information.this,MainFlowingActivity.class);
        startActivity(i);
        super.onBackPressed();
    }

    @Override
    public void onTabChanged(String tabId) {

    }
}
