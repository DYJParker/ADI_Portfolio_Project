Research Plan
======

1. Title - “Adulting” field study

2. Authors and stakeholders
    - Dave Parker, application author
    - Drew Mahrt, Charles Drews, instructors/evaluators

3. Date - 5/12/17

4. Background:

    Personally, I know that I’m always losing track of when I bought what groceries, when they go bad, and what staples I’m running low on. Preliminary, casual research suggests that people also worry about similar issues of time, such as forgetting about recurring bill, and keeping track of their emotions over time

5. Goals - I want to systematically establish the viability of and general interest in a tracking app with this particular bent..

6. Research questions:
    1. How much effort do people put into keeping track of these kind of “adulting” pieces of information over time.
    1. Do people find that they are presently and actively losing out by their failure to keep track of this kind of data.
    1. How much would they benefit, both in terms of reducing overhead and increasing compliance.
    1. What pieces of information do people need?
    1. Value of notifications vs actively opening the app themselves.
    

7. Methodology - Google Forms survey with additional one-on-one online/text interviews on any points requiring clarification.

8. Participants - Primarily 20s and early 30s, active professionals.

9. Schedule - Recruiting: 5/9, interviews: 5/10-5/11, results 5/12.

10. Script:
    1. How much food do you throw out due to it being over-old?
    1. When it comes to obligations outside of the professional sphere (ie ”adulting”), what are three other components you find most difficult?
    1. How much time/effort is spent on meeting these obligations?
    1. How much time/effort/money is spent or lost because of missed obligations?
    1. How valuable would it be to have informations/reminders about these obligations presented to you on a timely basis? Active presentation or available when you want it?

Research Highlights
=====

##### Observations
See [Research Results](https://docs.google.com/spreadsheets/d/1_B4CzoBiUgto04HnEUpAcpCNTTkiUooGh0xoFi5wP5k/edit?usp=sharing) for main body of raw feedback and additional notes from following up.

##### Insights
Seems people have either zero or significant interest in food tracking, marginal interest in bills specifically, but are potentially looking for a better, semi-general-purpose todo list. They are generally disinterested in active notification, particularly for food loss.

##### Design Recommendations
Streamline input, minimize intrusiveness of output, notifications should be opt-in.

##### Were there any new topics or open questions to research further?
How specialized do I want to be? I steered the conversation toward food, but that still got an underwhelming response, and people seem to want something a lot more flexible.

Persona Worksheet
=====

### Alice
- Bio & Demographic Details

    Late 20s, lives with roommate, makes decent money but still has to be cost-conscious.
- Behaviors & Habits

    Tends to order groceries online, mostly loses fruit/veg and leftovers to being too old.
- Needs/Problems/Goals

    Wants to waste less food, save money

### Bob
- Bio & Demographic Details

    Early 30s, lives alone, less worried about money.
- Behaviors & Habits

    Has too many balls in the air, tends to lose track of things.
- Needs/Problems/Goals

    Wants a better way to track responsibilities, being more aware of priority and how long something will take

Problem Statetements
=====
Alice needs a way to minimize food waste with minimal overhead, because she's tired of losing money and generally generating waste, but doesn't want to waste (brain-)time either.
- We believe that by using advanced digitla functionality (e.g. OCR, scraping of digital receipts, providing best-guesses for expiration timeframes) we will minimize overhead while enabling Alice to minimize waste.

Bob needs a more life-aware way to track his personal obligations, because he's tired of clogging up e.g. his calendar and still not having the information he needs.
- We believe that by providing a user-adjustable, context-aware way to track these obligations, we will lessen the need for Bob to spend brain-time (re)evaluating what he needs to do *now*.

Competitive Analysis
=====
Feature | this | Todoist | Grocery Tracker
---|---|---|---
Cloud synching | X | X | ?
Natural Language interface |  | X | 
Subtasking |  | X | X
Automated/expedited grocery tracking | X |  | X
Grocery expiration data | - |  | 
Prioritization | - | X | 
Advanced sharing/delegation |  | X | X
Price tracking |  |  | X
Predicts when one will run out |  |  | X

User Stories
=====
- As a grocery user, I can track expirable groceries.
    - As a grocery user, I can add groceries to my list
        - As a user, I can manually enter identifying information, optionally having it available for reuse.
        - As a user, I can take a photo to use as an icon if I don't want to type out a description.
        - As a user, I can scan UPCs to auto-add items to the list.
        - As a user, I can scrape an emailed receipt to auto-add everything.
        - As a user, I can OCR a physical receipt to auto-add everything.
    - As a grocery user, I can track a deadline for when I should consume a grocery item.
        - As a user, I can manually enter how long I expect it to last, which will be suggested next time the same item is re-added.
        - As a user, I can have looking up the information and entering it expedited.
        - As a user, I can have a best-guess for a new item automatically suggested.
    - As a grocery user, I can pull up a list of groceries I have finished, which I might need to re-order.
        - As a user, I can have items automatically added when they're marked "completed" on the to-be-consumed list.
        - As a user, I can add items manually
        - As a user, I can remove items I don't want to track
        - As a user, I can remove items from this list by moving them back to the to-be-consumed list.
        - As a user, I can have items automatically removed from this list if the item is entered on the to-be-consumed list.
        - As a user, I can blacklist items so that they will never be moved to this list.
- As a GI user, I can track non-grocery tasks.
    - As a GI user, I can add a due-date to my tasks.
        - As a GI user, I can sort by due-date.
        - As a GI user, I can view my tasks in a calendar view.
        - As a GI user, I can have the app remind me via notifications
    - As a GI user, I can add recurrance to my tasks.
        - As a GI user, I can set time- or count-limits to my recurrances.
    - As a GI user, I can add a relative priority to my tasks.
        - As a GI user, I can sort by priority
    - As a GI user, I can add a duration to my tasks.
        - As a GI user, I can sort by duration-start.
    - As a GI user, I can view my tasks in a way that weights each of the above three optional data-points.
- As a user, I can sync my list(s) to the cloud.
