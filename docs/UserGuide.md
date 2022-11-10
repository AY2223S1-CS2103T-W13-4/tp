---
layout: page
title: User Guide
---

## About TruthTable

Welcome to the User Guide for TruthTable! TruthTable is a desktop application that enables **student team leaders** 
to manage their **software engineering teams**, including **tasks, links and team member info**, in a single application.

TruthTable is **optimized for use via a [Command Line Interface (CLI)](#command-line-interface)** while still having the
benefits of a [Graphical User Interface (GUI)](#graphical-user-interface). If you can type fast, TruthTable can get your
task management done _blazingly fast_, faster than traditional GUI applications.

<div markdown="block" class="alert alert-primary">**:information_source: Unsure what CLI or GUI means?**
Head over to [this section](#understanding-truthtables-cli) to learn more!
</div>

If you're a student team leader for a software engineering team, this guide will help you understand how the various
features of TruthTable can help you manage your teams more efficiently.

Feel free to read on, or if you can't wait to get started, skip ahead to our [Getting Started guide](#getting-started) to start using TruthTable now!

## Key Features of TruthTable

### Organize all your info in one place

Managing project documents and information has always been annoying. Aside from the multitude of links and
slides created by your team, you may be using task management applications like
<a href="https://www.notion.so/" target="_blank">Notion</a> to track your team's progress as well. 

Find it hard to keep things organized? TruthTable allows you to collate and organize your **tasks, links, and team member info** all in one place.

### Track progress and delegate work

It is often difficult to visualize and communicate your team's progress to stakeholders. TruthTable solves this through
its clean and comprehensive user interface.

At a glance, you can see the **number of tasks completed by your team**, and determine the team's overall progress.

TruthTable allows you to see **which members are assigned to which tasks**, enabling you to delegate work in a fair and
equitable manner.

### Convenient and fast

Context switching is a productivity killer. Having to switch from project management to product development usually
means switching from GUI-based applications to CLI code editors.

Hence, TruthTable allows you to use a **single CLI for all your project management needs**, reducing the impact of context
switching.

<div markdown="span" class="alert alert-info">
**:star: For experienced CLI users**:
<br><br>
TruthTable's command syntax is actually very similar to other command line applications like
[Git](https://git-scm.com/) and [Docker](https://docs.docker.com/engine/reference/commandline/cli/)!

Hence, you will become familiar with TruthTable's commands in no time.
</div>

## Using This Guide

This document will guide you on how to get familiar with all of TruthTable's [features](#key-features-of-truthtable).
If you are an experienced user of TruthTable, this guide also contains valuable tips on how you can maximize your
productivity while using TruthTable.

While this guide can be quite long, feel free to jump ahead to any section in the [Table of Contents](#table-of-contents) below.

Here are the alerts to look out for while using this guide:

<div markdown="block" class="alert alert-primary">**:information_source: Important alert**:
Important information for all users to take note
</div>

<div markdown="block" class="alert alert-success">**:bulb: Tip for all users**:
Useful information.
</div>

<div markdown="block" class="alert alert-info">**:star: Tip for advanced users**:
Useful information for more experienced users.
</div>

<div markdown="block" class="alert alert-warning">**:exclamation: Warning alert**:
This alert contains important information to be wary of.
</div>

Here are some text styles to look out for as well.

| Text Style Example         | Meaning                                              |
|----------------------------|------------------------------------------------------|
| [Glossary link](#glossary) | Clickable link to navigate to a section in the guide |
| `text with background`     | Text relevant to commands or filenames               |
| <kbd>Esc</kbd>             | Keyboard button                                      |

## Table of Contents

* Table of Contents
{:toc}

--------------------------------------------------------------------------------------------------------------------

## Getting Started

1. Ensure you have **Java 11** or above installed on your computer. If not, follow the
   <a href="https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html" target="_blank">Java Installation Guide</a>
   for further instructions on how to download and install **Java 11**.

2. Download the latest version of `truthtable.jar` from [our "Releases" page](https://github.com/AY2223S1-CS2103T-W13-4/tp/releases).
   The file can be located under the "Assets" section of the page as seen in the image below.
   ![TruthTable Download Location](images/DownloadLocation.png)

3. Double-click on `truthtable.jar` to start the application. A window which looks similar to the screenshot below
   should appear in a few seconds. ![Ui](images/Ui.png)
   <div markdown="block" class="alert alert-success">**:bulb: Sample data**:
   We have also added some sample data for you to play around and familiarize yourself with 
   TruthTable's [features](#commands)!
   </div>
4. That's it! You can now follow our guide below on how to [navigate the application](#navigating-truthtables-application-interface).

[Back to Table of Contents](#table-of-contents)

---

## Navigating TruthTable's Application Interface

After opening TruthTable for the first time, you should see the following screen.

![Application Interface](images/ApplicationInterface.png)

Each section contains several [components](#component), which will be labelled in their respective sections below. These
parts are numbered, and their names and descriptions will be displayed in a tabular format.

### Teams Section

![Teams Section](images/TeamsSection.png)

This section displays the names of all the teams that you have created in TruthTable. Only the names of each team is
listed.

<div markdown="block" class="alert alert-primary">**:information_source: Note:**
There will always be one team in TruthTable named "default" (if no name is specified).
</div>

| Number                           | Component                                      | Description                                                                   |
|----------------------------------|------------------------------------------------|-------------------------------------------------------------------------------|
| <span class="text-blue">1</span> | <span class="text-blue">[Index](#index)</span> | <span class="text-blue">The index of the team in the list of all teams</span> |  
| <span class="text-blue">2</span> | <span class="text-blue">Name</span>            | <span class="text-blue">The name of the team at the specified index</span>    |

### Current Team Section

![Current Team Section](images/CurrentTeamSection.png)

This section contains information about your current team. It displays the currently selected team, along with the team
description, links, tasks, and members related to said team.

| Number                             | Component                                              | Description                                                                                                                                                    |
|------------------------------------|--------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| <span class="text-green">1</span>  | <span class="text-green">Team Name</span>              | <span class="text-green">The name of the selected team</span>                                                                                                  |  
| <span class="text-green">2</span>  | <span class="text-green">Team Description</span>       | <span class="text-green">The description of the selected team</span>                                                                                           |
| <span class="text-green">3</span>  | <span class="text-green">Link Name</span>              | <span class="text-green">The name of a link related to the selected team</span>                                                                                |
| <span class="text-green">4</span>  | <span class="text-green">Member [Index](#index)</span> | <span class="text-green">The index of a member in the team's list of members</span>                                                                            |
| <span class="text-green">5</span>  | <span class="text-green">Member Name</span>            | <span class="text-green">The name of a member at the specified member index</span>                                                                             |
| <span class="text-green">6</span>  | <span class="text-green">Task [Index](#index)</span>   | <span class="text-green">The index of a task in the team's list of tasks</span>                                                                                |
| <span class="text-green">7</span>  | <span class="text-green">Task Name</span>              | <span class="text-green">The name of a task at the specified task index</span>                                                                                 |
| <span class="text-green">8</span>  | <span class="text-green">Task Assignee</span>          | <span class="text-green">The name(s) of the member(s) assigned to the task</span>                                                                              |
| <span class="text-green">9</span>  | <span class="text-green">Task Completion Status</span> | <span class="text-green">The completion status of a task. `[X]` is displayed if task is completed, whereas `[ ]` is displayed if the task is incomplete</span> |
| <span class="text-green">10</span> | <span class="text-green">Task Completion Rate</span>   | <span class="text-green">The number (and percentage) of tasks that have been completed by the selected team</span>                                             |

### Persons Section

![Persons Section](images/PersonsSection.png)

This section displays the names, phone number, email, address, and tags of all persons that you have created in
TruthTable. This section is also known as the "Contacts" section.

| Number                          | Component                                     | Description                                                              |
|---------------------------------|-----------------------------------------------|--------------------------------------------------------------------------|
| <span class="text-red">1</span> | <span class="text-red">[Index](#index)</span> | <span class="text-red">The index of a person in the TruthTable</span>    |
| <span class="text-red">2</span> | <span class="text-red">Name</span>            | <span class="text-red">The name of the person at a specific index</span> |
| <span class="text-red">3</span> | <span class="text-red">Tags</span>            | <span class="text-red">The tags associated with a person</span>          |
| <span class="text-red">4</span> | <span class="text-red">Phone Number</span>    | <span class="text-red">The phone number of a person</span>               |
| <span class="text-red">5</span> | <span class="text-red">Email</span>           | <span class="text-red">The email address of a person</span>              |

### Command Section

![Command Section](images/CommandSection.png)

This section contains an input box where you can enter the commands for the actions that you wish to perform. Try
typing `help` in the input box and press <kbd>Enter</kbd> to see what happens!

| Number                           | Component                                        | Description                                                                                                                 |
|----------------------------------|--------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| <span class="text-pink">1</span> | <span class="text-pink">Command Result</span>    | <span class="text-pink">The result of executing a command in the Command Input Box</span>                                   |
| <span class="text-pink">2</span> | <span class="text-pink">Command Input Box</span> | <span class="text-pink">The input box for commands to be entered, which can be executed by pressing <kbd>Enter</kbd></span> |

[Back to Table of Contents](#table-of-contents)

---

## Understanding TruthTable's CLI

[Command Line Interface (CLI)](#command-line-interface) applications like TruthTable requires you to execute
instructions by typing specific words to make use of the application's features. On the other hand,
[Graphical User Interface (GUI)](#graphical-user-interface) programs usually require you to use a mouse and keyboard to
click on objects and perform certain features.

If you are not an experienced CLI user, however, terms like "commands", "flags", and "parameters" may appear daunting.

But fret not! This section will cover what all these terms actually mean.

### Commands, flags, and parameters

All instructions are executed through **[commands](#command)**. Each command can have **[flags](#flag) specified after
the command**, which modifies how the instruction should be carried out.

For each of these flags, there may be **[parameters](#parameter)** specified after it. But, **not all commands**
require parameters.

Note that flags and parameters always **come after the command**.

<div markdown="block" class="alert alert-primary">**:information_source: Do I need to memorize all these commands, 
parameters, and flags?**
<br><br>
Nope!
<br><br>
While you're going through this section, don't worry too much about memorizing the details of every command, as they all
have their own help messages that you can refer to at any time.
<br><br>
Furthermore, the commands in TruthTable are designed to be **easy to remember** and **natural**, so you will be familiar
with them in no time!
</div>

Let's use an example to break down what we've talked about.

#### Example Command: `add person`

![CLI Syntax](images/CliSyntax.png)

Here's a summary of what each highlighted section represents.

| Number                            | Name                                               | Meaning                                                                                                                |
|-----------------------------------|----------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| <span class="text-red">1</span>   | <span class="text-red">Command</span>              | <span class="text-red">The name of an instruction</span>                                                               |
| <span class="text-blue">2</span>  | <span class="text-blue">Flag/Option</span>         | <span class="text-blue">Text that is used to modify the operation of a command, often starting with `-` or `--`</span> |
| <span class="text-green">3</span> | <span class="text-green">Parameter/Argument</span> | <span class="text-green">Information specified for a command to operate, often used after flags</span>                 |

### Understanding the help message

Every command in TruthTable has its own flags and parameters, so you don't have to remember all of them.

Instead, each command allows you to specify the `-h` and `--help` flag, which brings up the available flags and
parameters for the command. Alternatively, you can also refer to this user guide to find out the details of any command.

#### Example Command Help Message: `assign task --help`

![Command Help Message](images/CommandHelpMessage.png)

Here's a summary of what each highlighted section represents.

| Number                            | Name                                                            | Special Syntax                                         | Remarks                                                                                                       |
|-----------------------------------|-----------------------------------------------------------------|--------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| <span class="text-red">1</span>   | <span class="text-red">Command</span>                           | <span class="text-red">-</span>                        | <span class="text-red">Only alphabets and spaces (all commands can be found [here](#commands))</span>         |
| <span class="text-green">2</span> | <span class="text-green">Optional Flag with no Parameter</span> | <span class="text-green">`[-flag]`</span>              | <span class="text-green">-</span>                                                                             |
| <span class="text-green">3</span> | <span class="text-green">Optional Flag with Parameters</span>   | <span class="text-green">`[-flag=<parameters>]`</span> | <span class="text-green">An ellipsis `...` is present only if more than 1 parameter is **allowed**</span>     |
| <span class="text-blue">4</span>  | <span class="text-blue">Required Flag with Parameters</span>    | <span class="text-blue">`flag=<parameters>`</span>     | <span class="text-blue">An ellipsis `...` is present only if more than 1 parameter is **allowed**</span>      |
| <span class="text-blue">5</span>  | <span class="text-blue">Required Parameter</span>               | <span class="text-blue">`<parameter>`</span>           | <span class="text-blue">All parameters are required by default</span>                                         |
| <span class="text-pink">6</span>  | <span class="text-pink">Flag/Parameter Name and Alias</span>    | <span class="text-pink">-</span>                       | <span class="text-pink">All aliases of a flag/parameter will be listed and separated with commas (`,`)</span> |
| <span class="text-pink">7</span>  | <span class="text-pink">Flag/Parameter Description</span>       | <span class="text-pink">-</span>                       | <span class="text-pink">Brief description of flag/parameter</span>                                            |

<div markdown="block" class="alert alert-primary">
**:information_source: Important note for flags**

- Specifying an "equal" sign (`=`) after the flag is optional, and it has no effect on the command.
- Optional flags are wrapped with square brackets (`[]`)
- Flags can be specified in any order
    - For e.g. `-n name -p 98765432` is the same as `-p 98765432 -n name`

</div>

<div markdown="block" class="alert alert-primary">
**:information_source: Important note for parameters**

Use of quotation marks around parameters (`""` and `''`) is optional.
<br><br>
**However**, if you are specifying a parameter with multiple words, you will need to wrap the words in quotes.
Otherwise, TruthTable will not carry out the command properly.

For instance,

- `add person -n "full name" ...` will recognize "full name" as the name being specified for the new person
- `add person -n full name ...` will recognize "full" as the name being specified for the new person, however, this
  command will not execute successfully as `name` will be treated as a **flag** (and this flag does not exist for
  the `add person` command)

Also, if your quotes are not closed properly (i.e. some open quotation mark does not have a corresponding close
quotation mark), the command will not be executed. If the parameter specified contains quotation marks, they will be
rejected as well.

For instance,

- `'word` is invalid as the open quotation mark `'` does not have a corresponding close quotation mark.
- `"'"` is invalid as `'` will be passed as a parameter, which is invalid.

</div>

<div markdown="block" class="alert alert-success">
**:bulb: Flags with multiple parameters**
<br><br>
If a flag is displayed with `...` behind it, this means that the flag accepts more than 1 parameter.
<br><br>
For instance, in the `assign task` command, we can specify more than 1 assignee (provided they are valid).
A valid command is `assign task 1 -a 1 2 3` where `1 2 3` are recognized as the assignees to the task with index `1`.
</div>


<div markdown="block" class="alert alert-info">
**:star: POSIX clustered short options** <br>
TruthTable supports clustered options as specified in
<a href="https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap12.html#tag_12_02" target="_blank">this document</a>.
</div>

### Aliases

To help you use our program even faster, we have introduced short forms for our commands and flags!

These short forms are what we call "aliases", and they allow you to execute instructions _blazingly fast_ by minimizing
the number of letters you need to type.

For instance, the [`add person`](#creating-a-new-person-add-person) command has the following command aliases,

- `add p`
- `a person`
- `a p`

The `add person` command also has the following flags and their corresponding aliases,

- aliases for `-h`: `--help`
- aliases for `-e`: `--email`
- aliases for `-n`: `--name`
- aliases for `-p`:`--phone`
- aliases for `-t`:`--tags`

You can find out more about these flags [here](#creating-a-new-person-add-person).

To view all commands and their respective aliases, head over to the [command summary section](#command-aliases)
to find out more.

[Back to Table of Contents](#table-of-contents)

---

## Commands

<div markdown="block" class="alert alert-primary">**:information_source: Make sure you have 
[read this section](#understanding-truthtables-cli) before continuing!**
</div>

TruthTable allows you to manage members, tasks, links, and members through the use of commands.

<div markdown="block" class="alert alert-primary">**:information_source: Persons vs Members**

The persons in TruthTable (as seen in the [persons section](#persons-section)) may not all be in a team. However, any
member of a team must be an existing person in TruthTable.
<br><br>
This is why TruthTable distinguishes between person and member commands.
</div>

Consequently, the commands are split into **5** main sections:

1. [Person commands](#commands-to-manage-persons) and [member commands](#commands-to-manage-members)
2. [Team commands](#commands-to-manage-teams)
3. [Task commands](#commands-to-manage-tasks)
4. [Link commands](#commands-to-manage-links--urls)
5. [General commands](#general-commands)

<div markdown="block" class="alert alert-primary">**:information_source: Command Format**

The format for each command adheres to the structure laid out in the
[help command section](#example-command-help-message-assign-task---help).
</div>

<div markdown="block" class="alert alert-primary">**:information_source: Parameters and Constraints**

Parameters are written in uppercase and wrapped with angle brackets (e.g. `<PARAMETER>`) in this guide.
<br><br>

Each parameter has its own constraints, which can be found [here](#flag-and-parameter-constraints).
</div>


<div markdown="block" class="alert alert-primary">**:information_source: Flags and Parameters**

- Every command has a `-h` and `--help` flag available to see their help message
- Flags wrapped with brackets (`()`) indicates that at least 1 flag inside the brackets must be specified
    - For `([-n <NAME>] [-p <PHONE>] [-e <EMAIL>] [-t [<TAGS>]]...)`, the following examples are valid
        1. `-n name`
        2. `-p 98765432`
        3. `-e new@email.com`
        4. `-t developer`
- Flags wrapped with brackets (`()`) and separated with `|` indicates that you must specify only 1 flag inside the
  brackets
    - For `(-n=<NAME_KEYWORDS> | -e=<EMAIL_KEYWORDS>)`, the following examples are valid
        1. `-n one two`
        2. `-e three four`
    - However, the following are invalid
        1. `-n one two -e three four`
        2. when both flags are empty
- Flags/Parameters with ellipsis (`...`) behind them means that more than 1 parameter can be specified
    - For `[-t [TAGS...]]...`, the following examples are valid
        1. `-t`
        2. `-t one`
        3. `-t one two`
        4. `-t one -t two`
- Flags can be combined if they all begin with `-`, where the flags are clustered. Find out more
  <a href="https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap12.html#tag_12_02" target="_blank">here</a>
    - For `[-h] [-c] [-i]`, the following examples are valid
        1. `-h`
        2. `-hc`
        3. `-ci`
        4. `-hci`
- If an extra parameter is specified, the command will not execute and an error message will be displayed
    - For e.g. `help with extra words` will display an error message

</div>

<div markdown="span" class="alert alert-success">
**:bulb: Letter casing for parameters** <br>
Note that the parameters in this user guide are all upper-cased, which differs from the lower-cased parameters in 
the help message that TruthTable displays whenever you run a command with `-h`.
</div>

### Commands to Manage Persons

Summary of the commands to manage persons can be found [here](#summary-of-person-commands).

#### Creating a new person: `add person`

It is the start of a new semester and you are excited to work with your new classmates on software engineering projects. 
You want to get to know them better before you work with them in your teams. There is a person that seem like a really 
fun person to work with, and you cannot wait to know more about them. Simply ask for their name, email and phone number 
and simply key in `add person -e <EMAIL> -n<NAME> -p<PHONE>` and their contact details will be ! Now you can contact 
them easily before you form your project groups. You may optionally specify `-t <TAGS>` for any interesting features 
you remember of the person!

The `add person` command allows you to add a new person to TruthTable. The new person is added to the [persons section](#persons-section) as seen in the image
below. Do not worry if an error shows up, you might have typed something wrongly. Here, let us take a quick walkthrough 
on how to add a person.

Let us try to add a new person called John Doe. Enter the command

`add person -n "John Doe" -p 98765432 -e johnd@example.com` 

If done successfully, you should see a new person show up in the [persons section](#persons-section) as seen below. Please 
refer below. 

If you are still unsure, please enter `add person -h` and our application will give you a comprehensive guide on how 
to use this command. 

If you want to know more about the details of the command, please refer to the format and table directly below.

If you want more examples usages, please see the examples below.

![Add Person Example](images/AddPersonExample.png)

**Format:** `add person [-h] -e=<EMAIL> -n=<NAME> -p=<PHONE> [-t[=<TAGS>...]]...`

| Flags           | Required           | Remarks                                                                |
|-----------------|--------------------|------------------------------------------------------------------------|
| `-h`, `--help`  | :x:                | Shows [help message](#understanding-the-help-message) for this command |
| `-e`, `--email` | :heavy_check_mark: | Email of person (e.g. truth@table.com)                                 |
| `-n`, `--name`  | :heavy_check_mark: | Name of person (e.g. "Truth Table")                                    |
| `-p`,`--phone`  | :heavy_check_mark: | Phone of person (e.g. 98765432)                                        |
| `-t`,`--tags`   | :x:                | Tags of person (e.g. Frontend, Backend)                                |

<div markdown="span" class="alert alert-success">:bulb: **Tip:**
A person can have any number of tags (including 0).
</div>

**Command Aliases:**

- `a person`
- `add p`
- `a p`

**Examples:**

* `add person -n "John Doe" -p 98765432 -e johnd@example.com` adds a person named "John Doe", with phone number
  "98765432" and email "johnd@example.com".
* `a p -n "Betsy Crowe" -e betsycrowe@example.com -p 12345678 -t criminal friend` adds a person named "Betsy Crowe",
  with phone number "12345678" and tags named "criminal" and "friend".

#### Editing a person: `edit person`

Opps! Seems like your classmate might have provided his school email instead of his github email. Not to worry, you 
can edit their contact details easily with `edit person`! First, identify the index number of your classmate in the
[persons section](#persons-section). If you are not able to find their name visibly, refer to 
[find command](#finding-a-person-find-person) on how you can find your classmate easily. Next, key in 
`edit person <INDEX_NUMBER> -e <NEW_EMAIL>` to change their email! You can edit other contact details as well.

The `edit person` command allows you to edit an existing person in TruthTable. The edited person's details will be shown in the
[persons section](#persons-section) as seen in the image below. As always, do not panic if you see an error message. Let 
us run through how to edit the details of a person.

Suppose your classmate Alex Yeoh has provided you with the wrong phone and email. Identify the index number of
`Alex Yeoh` in the application (1 in the image below). Enter the command 

`edit person 1 -p 91234567 -e johndoe@example.com`

If done successfully, you should see the new details show up under in the [persons section](#persons-section)
under `Alex Yeoh` as seen below. 

Unable to find a person you are looking for? Please check that you have added the person into TruthTable! Refer to the 
above [add person command](#creating-a-new-person-add-person) to add a new person into TruthTable. 

If you are still unsure, please enter `edit person -h` and our application will give you a comprehensive guide on how
to use this command.

If you want to know more about the details of the command, please refer to the format and table directly below.

If you want more examples usages, please see the examples below.

![Edit Person Example](images/EditPersonExample.png)

**Format:** `edit person [-h] ([-n=<PERSON_NAME>] [-p=<PERSON_PHONE>] [-e=<PERSON_EMAIL>] 
[-t[=\<PERSON_TAGS\>...]]...) <PERSON_INDEX>`

| Flags           | Required   | Remarks                                                                |
|-----------------|------------|------------------------------------------------------------------------|
| `-h`, `--help`  | :x:        | Shows [help message](#understanding-the-help-message) for this command |
| `-e`, `--email` | :asterisk: | Email of person (e.g. truth@table.com)                                 |
| `-n`, `--name`  | :asterisk: | Name of person (e.g. "Truth Table")                                    |
| `-p`,`--phone`  | :asterisk: | Phone of person (e.g. 98765432)                                        |
| `-t`,`--tags`   | :asterisk: | Tags of person (e.g. Frontend, Backend)                                |

:asterisk: - at least one of the flags for email, name, phone, and tags must be specified

* Edits the person at the specified `PERSON_INDEX`, which refers to the index number shown in the
  [persons section](#persons-section)
* `PERSON_INDEX` **must be a positive integer:** 1, 2, 3,...
* Each field only updates if the flag for that field is specified.
* When editing tags, the existing tags of the person will be **completely replaced** by the new tags specified.
* So, you can remove all the person’s tags by typing `-t` without specifying any tags after it.

**Command Aliases:**

- `edit p`
- `e person`
- `e p`

**Examples:**

* `edit person 1 -p 91234567 -e johndoe@example.com` Edits the phone number and email address of the 1st person to be
  "91234567" and "johndoe@example.com" respectively.
* `edit person 2 -n Betsy Crowe -t` Edits the name of the 2nd person to be "Betsy Crowe" and clears all existing tags.

#### Deleting a person: `delete person`

Alas, you are done with the project and will no longer be working with this classmate of yours. Not to worry, you
can delete their contact details easily with `delete person`! First, identify the index number of your classmate in the
[persons section](#persons-section). If you are not able to find their name visibly, refer to 
[find command](#finding-a-person-find-person) on how you can find your classmate easily. Next, key in `delete person <INDEX_NUMBER>` 
to remove them from TruthTable.

The `delete person` command allows you to delete the specified person from TruthTable. The person deleted will be 
removed from the [persons section](#persons-section) as seen in the image below. Let us run through how to delete a 
person.

Suppose you will never work with your classmate Alex Yeoh. Identify the index number of `Alex Yeoh` in the
application (1 in the image below). Enter the command

`delete person 1`

If done successfully, you should the person `Alex Yeoh` removed under the [persons section](#persons-section).

Unable to find a person you are looking for? Please check that you have added the person into TruthTable! Refer to the
above [add person command](#creating-a-new-person-add-person) to add a new person into TruthTable.

If you are still unsure, please enter `delete person -h` and our application will give you a comprehensive guide on how
to use this command.

If you want to know more about the details of the command, please refer to the format and table directly below.

If you want more examples usages, please see the examples below.

![Delete Person Example](images/DeletePersonExample.png)

**Format:** `delete person [-h] <PERSON_INDEX>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* Deletes the person at the specified `PERSON_INDEX`, which refers to the index number shown in the
  [persons section](#persons-section)
* `PERSON_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `delete p`
- `d person`
- `d p`

**Examples:**

* [`list persons`](#listing-all-persons-list-persons) followed by `delete person 2` deletes the 2nd person in
  TruthTable.
* [`find person Betsy`](#finding-a-person-find-person) followed by `delete person 1` deletes the 1st person in the
  results of the `find person` command.

#### Finding a person: `find person`

You recall talking to the guy called Alex in your class but you do not remember his full name. Not to worry, you
can find their contact details easily with `find person`! First, recall his first name or any keyword you can remember 
from his full name. Next, key in `find person <PERSON_NAME_KEYWORDS>`, and TruthTable will show you all persons with 
names that contain the keywords that you specified!

The `delete person` command allows you to finds all persons whose names contain any of the given keywords. 
The persons with matching names will be shown in the [persons section](#persons-section) as seen in the image below.
Let us run through how to find a person.

Suppose you want to find all people named Alex and all people named David. Enter the command

`find person alex david`

If done successfully, you should the see all persons named Alex and David show up under in the
[persons section](#persons-section).

Unable to find a person you are looking for? Please check that you have added the person into TruthTable! Refer to the
above [add person command](#creating-a-new-person-add-person) to add a new person into TruthTable.

If you are still unsure, please enter `find person -h` and our application will give you a comprehensive guide on how
to use this command.

If you want to know more about the details of the command, please refer to the format and table directly below.

If you want more examples usages, please see the examples below.

![result for 'find person alex david'](images/findPersonAlexDavidResult.png)

**Format:** `find person [-h] <PERSON_NAME_KEYWORDS>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* Only the name is searched.
* The search is case-insensitive, e.g. `alex` will match `Alex`.
* The order of the keywords does not matter, e.g. `Yeoh Alex` will match `Alex Yeoh`.
* Persons with names partially matching the keywords will be returned, e.g. `ale` will match `Alex`.
* Persons with names matching at least one keyword will be returned, e.g. `alex yu` will match 
  `Alex Yeoh`, `Bernice Yu`.

**Command Aliases:**

- `find p`
- `f person`
- `f p`

**Examples:**

* `find person John` returns `john` and `John Doe`.
* `find person alex david` returns `Alex Yeoh`, `David Li`.

#### Listing all persons: `list persons`

You want to see an overview of all your classmates. Key in `list persons`, and TruthTable will show you all persons that 
currently exist in your TruthTable

The `list persons` command shows a list of all persons in TruthTable. After running the 
[`find person`](#finding-a-person-find-person) command, you may wish to view all persons again. To do so, the list 
persons command will update the [persons section](#persons-section) and display all persons as seen in the image below.

If done successfully, you should the see all persons show up under in the [persons section](#persons-section) as shown
below.

Unable to find a person you are looking for? Please check that you have added the person into TruthTable! Refer to the
above [add person command](#creating-a-new-person-add-person) to add a new person into TruthTable.

If you are still unsure, please enter `list persons -h` and our application will give you a comprehensive guide on how
to use this command.

If you want to know more about the details of the command, please refer to the format and table directly below.

If you want more examples usages, please see the examples below.

![List Persons Example](images/DeletePersonExample.png)

**Format:** `list persons [-h]`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

**Command Aliases:**

- `list p`
- `l persons`
- `l p`

### Commands to Manage Members

Summary of the commands to manage members can be found [here](#summary-of-member-commands).

#### Adding a new member to the team: `add member`

Adds a new team member to the user’s currently selected team. If the member already exists in the team, an error message
will be displayed.

![Add Member Example](images/AddMemberExample.png)

**Format:** `add member [-h] <PERSON_INDEX>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* `PERSON_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `add m`
- `a member`
- `a m`

**Examples:**

- `add member 1` will add the first person in the [persons sections](#persons-section) as a new member to the
  [currently selected team](#current-team-section).

#### Delete a member from team: `delete member`

Delete a team member from the user’s team.

**Format:** `delete member [-h] <MEMBER_INDEX>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* `MEMBER_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `delete m`
- `d member`
- `d m`

**Examples:**

- `delete member 2` will delete the second member of the current team.

#### Finding a member: `find member`

Finds all members in the current team whose names or emails contain any of the given keywords.

<div markdown="span" class="alert alert-primary">
:information_source: **Note** <br> You can find members using **either** emails or names. This means that you 
should **not** use both `-n` and `-e` in the `find member` command. 
</div>

**Format:** `find member [-h] (-n=<MEMBER_NAME_KEYWORDS> | -e=<MEMBER_EMAIL_KEYWORDS>)`

| Flags           | Required | Remarks                                                                |
|-----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help`  | :x:      | Shows [help message](#understanding-the-help-message) for this command |
| `-n`, `--name`  | :hash:   | Keywords to filter by name                                             |
| `-e`, `--email` | :hash:   | Keywords to filter by email                                            |

:hash: - exactly one of the flags for name or email must be specified

* Only the name or email is searched.
* The search is case-insensitive, e.g. `alex` will match `Alex`.
* The order of the keywords does not matter, e.g. `Yeoh Alex` will match `Alex Yeoh`.
* Persons with names partially matching the keywords will be returned, e.g. `ale` will match `Alex`.
* Persons with names matching at least one keyword will be returned, e.g. `alex yu` will match
  `Alex Yeoh`, `Bernice Yu`.

**Command Aliases:**

- `find m`
- `f member`
- `f m`

**Examples:**

* `find member -n Alex` finds team members with **names** containing the word "Alex".
* `find member -n Alex Beatrice` finds team members with **names** containing **either** "Alex" or "Beatrice".
* `find member -e alex@gmail.com`  finds team members with **emails** containing "alex@gmail.com".

#### Listing all members of the team: `list members`

View all the members currently in the team, in the form of a list.

**Format:** `list members [-h]`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

**Command Aliases:**

- `list m`
- `l members`
- `l m`

#### Sort members: `sort members`

Sorts all members in the current team by name and displays them in the member list.

**Format:** `sort members [-h] <ORDER>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

| Order Value | Description                                                                 |
|-------------|-----------------------------------------------------------------------------|
| `asc`       | Sorts team members in **alphabetical** order (based on their names)         |
| `dsc`       | Sorts team members in **reverse alphabetical** order (based on their names) |
| `res`       | **Resets** the order of the team members shown back to default (unsorted)   |

**Command Aliases:**

- `sort m`
- `so members`
- `so m`

**Examples:**

* `sort members asc` sorts team members in **ascending** order.
* `sort members dsc` sorts team members in **descending** order.
* `sort members res` **resets** the order of team members shown.

### Commands to Manage Teams

Summary of the commands to manage teams can be found [here](#summary-of-team-commands).

#### Creating a new team: `add team`

Add a new team to your list of teams, an error will be displayed if the team name is already in use.

**Format:** `add team [-h] [-d=TEAM_DESCRIPTION] <TEAM_NAME>`

| Flags                 | Required | Remarks                                                                |
|-----------------------|----------|------------------------------------------------------------------------|
| `-h`, `--help`        | :x:      | Shows [help message](#understanding-the-help-message) for this command |
| `-d`, `--description` | :x:      | Description of team (e.g. "A team to manage CS2103T")                  | 

**Command Aliases:**

- `add te`
- `a team`
- `a te`

**Examples:**

- `add team CS2103T` will create a new team by the name of "CS2103T"
- `add team CS2102 -d "Database Systems"` will create a new team by the name of "CS2102" and "Database Systems"
  as description

#### Edit current team: `edit team`

**Format:** `edit team [-h] ([-n=<TEAM_NAME>] [-d=<TEAM_DESCRIPTION>])`

| Flags                 | Required   | Remarks                                                                |
|-----------------------|------------|------------------------------------------------------------------------|
| `-h`, `--help`        | :x:        | Shows [help message](#understanding-the-help-message) for this command |
| `-n`, `--name`        | :asterisk: | Name of team (e.g. "CS2103T")                                          |
| `-d`, `--description` | :asterisk: | Description of team (e.g. "A team to manage CS2103T")                  | 

:asterisk: - at least one of the flags for name and description must be specified

**Command Aliases:**

- `edit te`
- `e team`
- `e te`

**Examples:**

- `edit team -n CS2103T -d "Software Engineering"` will edit the name of the
  [currently selected team](#current-team-section) to CS2103T and description to "Software Engineering"

#### Delete an existing team: `delete team`

Delete an existing team, and an error is displayed if

- The target team does not exist, or
- The target team is the only existing team.

**Format:** `delete team [-h] <TEAM_NAME>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

**Command Aliases:**

- `delete te`
- `d team`
- `d te`

**Examples:**

- `delete team CS2103T` will delete the team with the name "CS2103T"

#### Set a new team: `set team`

Updates the [selected team](#current-team-section) and changes the current "working" team to another. An error is
displayed if team does not exist.

**Format:** `set team [-h] <TEAM_NAME>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

**Command Aliases:**

- `set te`
- `s team`
- `s te`

**Examples:**

- `set team CS2103T` will change the currently selected team to be the "CS2103T" team.

### Commands to Manage Tasks

Summary of the commands to manage tasks can be found [here](#summary-of-task-commands).

#### Add task to team: `add task`

Add a new task to your current team. Each task can have multiple assignees and a deadline.

**Format:** `add task [-h] [-d=<TASK_DEADLINE>] [-a[=<TASK_ASSIGNEES>...]]... <TASK_NAME>`

| Flags              | Required | Remarks                                                                |
|--------------------|----------|------------------------------------------------------------------------|
| `-h`, `--help`     | :x:      | Shows [help message](#understanding-the-help-message) for this command |
| `-d`, `--deadline` | :x:      | Deadline of task (e.g. 2023-02-25 23:59)                               |  
| `-a`, `--assignee` | :x:      | Index of members in [members section](#current-team-section)           |

* `TASK_DEADLINE` contains both the date and time in `YYYY-MM-DD HH:MM` format, and it **does not have quotation marks
  (`""`)
  around the parameter**.
* `TASK_ASSIGNEES` **must be positive integers:** 1, 2, 3,...

**Command Aliases:**

- `add ta`
- `a task`
- `a ta`

**Examples:**

* `add task "Create PR"` will add a task with the name "Create PR", to the current team's task list.
* `add task "Merge PR" -a 1 -d 2022-12-02 23:59` will add a task with the name "Merge PR", assigned to the first member
  of your team's members list, and a deadline of 2nd Dec 2022 23:59, to the current team's task list.
* `add task "Review PR" -a 1 3 -d 2022-12-02 23:59` will add a task with the name "Review PR", assigned to the first and
  third members of your team's members list, and a deadline of 2nd Dec 2022 23:59, to the current team's task list.

#### Edit task in team: `edit task`

Edits a specified task in the current team's task list.

**Format:** `edit task [-h] ([-n=<NAME>] [-d=<DEADLINE>] [-a[=<ASSIGNEES>...]]...) <TASK_INDEX>`


<div markdown="span" class="alert alert-warning">:exclamation: **Command Format** <br>
Ensure that `TASK_INDEX` is entered before entering any `ASSIGNEES`, as they both take in positive integers. 
Passing `TASK_INDEX` after `ASSIGNEES` makes it impossible to distinguish which number is actually the `TASK_INDEX`.
</div>

| Flags              | Required   | Remarks                                                                |
|--------------------|------------|------------------------------------------------------------------------|
| `-h`, `--help`     | :x:        | Shows [help message](#understanding-the-help-message) for this command |
| `-n`, `--name`     | :asterisk: | Name of task (e.g. "merge PR#12")                                      |
| `-d`, `--deadline` | :asterisk: | Deadline of task (e.g. 2023-02-25 23:59)                               |
| `-a`, `--assignee` | :asterisk: | Index of members in [members section](#current-team-section)           |

:asterisk: - at least one of the flags for name, deadline, and assignees must be specified

* Edits the person at the specified `TASK_INDEX`, which refers to the index number shown in the
  [team members section](#current-team-section)
* `DEADLINE` contains both the date and time in `YYYY-MM-DD HH:MM` format, and it **does not have quotation marks (`""`)
  around the parameter**.
* `TASK_INDEX` and `ASSIGNEES` **must be positive integers:** 1, 2, 3,...
* Each field only updates if the flag for that field is specified.
* When editing assignees, the existing assignees of the task will be **completely replaced** by the new assignees
  specified.
* So, you can remove all the assignees of the task by typing `-a` without specifying any assignees after it.

**Command Aliases:**

- `edit ta`
- `e task`
- `e ta`

**Examples:**

* `edit task 1 "Merge PR" -a 1 -d 2022-12-02 23:59` will edit the first task in the current team's task list, setting
  the name as "Merge PR", assignees as the first member in the team list, and deadline as 2nd Dec 2022 23:59.
* `edit task 1 "Update UG" -d 2022-12-02 23:59` will edit the first task in the current team's task list, setting the
  name as "Update UG" and deadline as 2nd Dec 2022 23:59. The assignees are not modified in this example.
* `edit task 1 -a` will edit the first task in the current team's task list, removing all assignees from the task. The
  name and deadline are not modified in this example.

#### Delete task from team: `delete task`

Delete an existing task from the team at the given task index.

**Format:** `delete task [-h] <TASK_INDEX>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* `TASK_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `delete ta`
- `d task`
- `d ta`

**Examples:**

- `delete task 1` will delete the first task of the current team.

#### Finding a task: `find task`

Find all tasks in the current team's task list whose names matches any of the given keywords.

To reset the task list, see the [list tasks command](#list-tasks-in-team-list-tasks).

**Format:** `find task [-h] <TASK_NAME_KEYWORDS>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* Only the task name is searched.
* The search is case-insensitive. e.g. `user guide` will match `User Guide`
* The order of the keywords does not matter. e.g. `User Guide` will match `guide user`
* Tasks with names partially matching the keywords will be returned, e.g. `user` will match `userguide`.
* Tasks with names matching at least one keyword will be returned, e.g. `guide case` will match `use case`, 
  `user guide`.

**Command Aliases:**

- `find ta`
- `f task`
- `f ta`

**Examples:**

* `find task User Guide` finds tasks with **names** containing **either** the word "User" or "Guide".

#### Mark tasks as done: `mark`

Mark a specified task as done. To undo this command, see the [unmark command](#unmark-tasks-as-done-unmark)

**Format:** `mark [-h] <TASK_INDEX>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* `TASK_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `m`

**Examples:**

- `mark 1` will mark the first task in the team as done.

#### Unmark tasks as done: `unmark`

Mark a specified task as incomplete. This will undo the [mark command](#mark-tasks-as-done-mark).

**Format:** `unmark [-h] <TASK_INDEX>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* `TASK_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `u`

**Examples:**

- `unmark 1` will mark the first task in the team as incomplete.

#### Set Deadline for task: `set deadline`

Set a deadline for an existing task, and the deadline must be in `YYYY-MM-DD HH:MM` format.

**Format:** `set deadline [-h] <TASK_INDEX> <TASK_DEADLINE>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* `TASK_INDEX` **must be a positive integer:** 1, 2, 3,...
* `TASK_DEADLINE` contains both the date and time in `YYYY-MM-DD HH:MM` format, and it **does not have quotation marks
  (`""`)
  around the parameter**.

**Command Aliases:**

- `set d`
- `s deadline`
- `s d`

**Examples:**

- `set deadline 1 2023-12-25 23:59` will set the deadline for the first task on the task list as 25 Dec 2023 23:59

#### Assign a task to team member: `assign task`

Assign an existing task to a team member in the user’s team.

**Format:** `assign task [-h] -a[=<TASK_ASSIGNEES>...] [-a[=<TASK_ASSIGNEES>...]]... <TASK_INDEX>`

<div markdown="block" class="alert alert-success">**:bulb: Note**:

The format for the `-a` flag indicates that you must specify at least 1 `-a` flag in your command,

- the first instance of `-a` indicates that you must specify the `-a` flag, and
- the second instance of `-a` indicates that you can specify 0 or more `-a` flags.
  <br>
  This results in requiring at least 1 `-a` flag.

</div>

| Flags              | Required           | Remarks                                                                |
|--------------------|--------------------|------------------------------------------------------------------------|
| `-h`, `--help`     | :x:                | Shows [help message](#understanding-the-help-message) for this command |
| `-a`, `--assignee` | :heavy_check_mark: | Index of members in [members section](#current-team-section)           |

* `TASK_INDEX` and `TASK_ASSIGNEES` **must be positive integers:** 1, 2, 3,...
* The original assignees of the task will not be replaced with this command, instead, only new assignees can be added.
* To remove assignees from a task, you can use the [`edit task` command](#edit-task-in-team-edit-task)

**Command Aliases:**

- `assign ta`
- `as task`
- `as ta`

**Examples:**

- `assign task 1 -a` will not do anything.
- `assign task 1 -a 1` will assign the first task on the task list to the first member in the team.
- `assign task 2 -a 1 2` will assign the second task on the task list to the first and second member in the team.

#### Assign a task to random team member: `assign random`

Assign an existing task to a random team member in the user’s team. This command will not work if the team is empty or
if the task has already been assigned to all members of the team.

**Format:** `assign random [-h] <TASK_INDEX>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* `TASK_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `assign r`
- `as random`
- `as r`

**Examples:**

- `assign random 1` will assign the first task on the task list to a random team member.

#### Filter tasks by team member: `tasksof`

Find all tasks that have been assigned to a particular member in the currently selected team.

**Format:** `tasksof [-h] <MEMBER_INDEX>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* `MEMBER_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `to`

**Examples:**

* `tasksof 1` will show all tasks assigned to the first member in your current team's member list.

#### List tasks in team: `list tasks`

View all the tasks in the [currently selected team](#current-team-section). These tasks can also be filtered based on
whether they are complete or incomplete tasks.

This command can also be used to view all tasks again after using the [`find task` command](#finding-a-task-find-task)
as the `find task` command filters the current team’s tasks based on some keyword(s).

**Format:** `list tasks [-h] [-c] [-i]`

| Flags                | Required | Remarks                                                                |
|----------------------|----------|------------------------------------------------------------------------|
| `-h`, `--help`       | :x:      | Shows [help message](#understanding-the-help-message) for this command |
| `-c`, `--complete`   | :x:      | Filter for completed tasks                                             |
| `-i`, `--incomplete` | :x:      | Filter for incomplete tasks                                            |

**Command Aliases:**

- `list ta`
- `l tasks`
- `l ta`

**Examples:**

- `list tasks` will list all the tasks of the current team.
- `list tasks -i` will list all the incomplete tasks of the current team.
- `list tasks -c` will list all the completed tasks of the current team.
- `list tasks -ic` will list all tasks of the current team.

#### Sort tasks: `sort tasks`

Sorts all tasks in the current team by name and displays them in the task list.

**Format:** `sort tasks [-h] <ORDER>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

| Order Value | Description                                                          |
|-------------|----------------------------------------------------------------------|
| `asc`       | Sorts tasks in **alphabetical** order (based on their names)         |
| `dsc`       | Sorts tasks in **reverse alphabetical** order (based on their names) |
| `res`       | **Resets** the order of the tasks shown back to default (unsorted)   |

**Command Aliases:**

- `sort ta`
- `so tasks`
- `so ta`

**Examples:**

* `sort tasks asc` sorts tasks in **ascending** order.
* `sort tasks dsc` sorts tasks in **descending** order.
* `sort tasks res` **resets** the order of the tasks shown.

#### View summary of task assignments in team: `summary`

View the number of tasks assigned to each member in the team.

**Format:** `summary [-h]`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

**Command Aliases:**

- `sum`
- `su`

### Commands to Manage Links / URLs

Summary of the commands to manage links can be found [here](#summary-of-link-commands).

#### Add a new link: `add link`

Add a new link to the currently selected team.

**Format:** `add link [-h] -l=<LINK_URL> -n=<LINK_NAME>`

| Flags          | Required           | Remarks                                                                |
|----------------|--------------------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:                | Shows [help message](#understanding-the-help-message) for this command |
| `-l`, `--link` | :heavy_check_mark: | URL of link (e.g. https://google.com)                                  |
| `-n`, `--name` | :heavy_check_mark: | Name of link (e.g. "Meeting #1")                                       |

**Command Aliases:**

- `add l`
- `a link`
- `a l`

**Examples:**

- `add link -n google -l https://google.com` will add a link named "google" with the URL "https://google.com".

#### Edit an existing link: `edit link`

Edit an existing link in the currently selected team.

**Format:** `edit link [-h] ([-n=<LINK_NAME>] [-l=<LINK_URL>]) <LINK_INDEX>`

| Flags          | Required   | Remarks                                                                |
|----------------|------------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:        | Shows [help message](#understanding-the-help-message) for this command |
| `-l`, `--link` | :asterisk: | URL of link (e.g. https://google.com)                                  |
| `-n`, `--name` | :asterisk: | Name of link (e.g. "Meeting #1")                                       |

:asterisk: - at least one of the flags for link and name must be specified

* `LINK_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `edit l`
- `e link`
- `e l`

**Examples:**

- `edit link 1 -n facebook -l https://facebook.com` will update the 1st link to have the name "facebook" with the URL
  of "https://facebook.com".
- `edit link 1 -n google` will update the 1st link to have the name "google".

#### Delete an existing link: `delete link`

Delete the specified link from the currently selected team.

**Format:** `delete link [-h] <LINK_INDEX>`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

* `LINK_INDEX` **must be a positive integer:** 1, 2, 3,...

**Command Aliases:**

- `delete l`
- `d link`
- `d l`

**Examples:**

- `delete link 1` will delete the 1st link

### General Commands

Summary of the general commands can be found [here](#summary-of-general-commands).

#### Clearing all entries: `clear`

Deletes everything from the application, including persons, teams, tasks, links, and member information.

<div markdown="span" class="alert alert-warning">:exclamation: **Caution: This action is irreversible!**
</div>

**Format:** `clear [-h]`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

#### Switching between light and dark theme: `theme`

Whether you're someone that likes a light theme or dark theme, we've got you covered!

This command allows you to toggle between light theme and dark theme.

**Format:** `theme [-h]`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

**Command Aliases:**

- `th`

#### Exiting the program: `exit`

Closes the program after 3 seconds.

**Format:** `exit [-h]`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

**Command Aliases:**

- `quit`
- `bye`
- `ex`

#### Viewing help: `help`

Shows the available commands in TruthTable as well as URL to this help page at the bottom.

**Format:** `help [-h]`

| Flags          | Required | Remarks                                                                |
|----------------|----------|------------------------------------------------------------------------|
| `-h`, `--help` | :x:      | Shows [help message](#understanding-the-help-message) for this command |

**Command Aliases:**

- `h`

---

## Saving the data

TruthTable's data is saved in the hard disk automatically after running any command that changes data. There is no need
to save manually.

[Back to Table of Contents](#table-of-contents)

## Editing the data file

TruthTable data is saved as a [JSON file](#json-file), which can be found in the location where `truthtable.jar`
is opened from (let's call it `TRUTHTABLE_LOCATION`) and going to `TRUTHTABLE_LOCATION/data/truthtable.json`.

Advanced users are welcomed to update data directly by editing that data file.

<div markdown="span" class="alert alert-warning">:exclamation: **Caution:**
If your changes to the data file makes its format invalid, TruthTable will discard all data and start with an empty
data file on the next run.
</div>

[Back to Table of Contents](#table-of-contents)

---

## FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains
the data of your previous TruthTable home folder.

[Back to Table of Contents](#table-of-contents)

---

## Command Summary

### Command Aliases

| Action                                                                                        | Command         | Aliases                         |
|-----------------------------------------------------------------------------------------------|-----------------|---------------------------------|
| [Creating a new person](#creating-a-new-person-add-person)                                    | `add person`    | `a p`, `add p`, `a person`      |
| [Editing a person](#editing-a-person-edit-person)                                             | `edit person`   | `e p`, `edit p`, `e person`     |
| [Deleting a person](#deleting-a-person-delete-person)                                         | `delete person` | `d p`, `delete p`, `d person`   |
| [Finding a person](#finding-a-person-find-person)                                             | `find person`   | `f p`, `find p`, `f person`     |
| [Listing all persons](#listing-all-persons-list-persons)                                      | `list persons`  | `l p`, `list p`, `l persons`    |
| [Adding a new member to the team](#adding-a-new-member-to-the-team-add-member)                | `add member`    | `a m`, `add m`, `a member`      |
| [Delete a member from team](#delete-a-member-from-team-delete-member)                         | `delete member` | `d m`, `delete m`, `d member`   |
| [Finding a member](#finding-a-member-find-member)                                             | `find member`   | `f m`, `find m`, `f member`     |
| [Listing all members of the team](#listing-all-members-of-the-team-list-members)              | `list members`  | `l m`, `list m`, `l members`    |
| [Sort members](#sort-members-sort-members)                                                    | `sort members`  | `so m`, `sort m`, `so members`  |
| [Creating a new team](#creating-a-new-team-add-team)                                          | `add team`      | `a te`, `add te`, `a team`      |
| [Edit current team](#edit-current-team-edit-team)                                             | `edit team`     | `e te`, `edit te`, `e team`     |
| [Delete an existing team](#delete-an-existing-team-delete-team)                               | `delete team`   | `d te`, `delete te`, `d team`   |
| [Set a new team](#set-a-new-team-set-team)                                                    | `set team`      | `s te`, `set te`, `s team`      |
| [Add task to team](#add-task-to-team-add-task)                                                | `add task`      | `a ta`, `add ta`, `a task`      |
| [Edit task in team](#edit-task-in-team-edit-task)                                             | `edit task`     | `e ta`, `edit ta`, `e task`     |
| [Delete task from team](#delete-task-from-team-delete-task)                                   | `delete task`   | `d ta`, `delete ta`, `d task`   |
| [Finding a task](#finding-a-task-find-task)                                                   | `find task`     | `f ta`, `find ta`, `f task`     |
| [Mark tasks as done](#mark-tasks-as-done-mark)                                                | `mark`          | `m`                             |
| [Unmark tasks as done](#unmark-tasks-as-done-unmark)                                          | `unmark`        | `u`                             |
| [Set Deadline for task](#set-deadline-for-task-set-deadline)                                  | `set deadline`  | `s d`, `set d`, `s deadline`    |
| [Assign a task to team member](#assign-a-task-to-team-member-assign-task)                     | `assign task`   | `as ta`, `assign ta`, `as task` |
| [Assign a task to random team member](#assign-a-task-to-random-team-member-assign-random)     | `assign random` | `as r`, `assign r`, `as random` |
| [Filter tasks by team member](#filter-tasks-by-team-member-tasksof)                           | `tasksof`       | `to`                            |
| [List tasks in team](#list-tasks-in-team-list-tasks)                                          | `list tasks`    | `l ta`, `list ta`, `l tasks`    |
| [Sort tasks](#sort-tasks-sort-tasks)                                                          | `sort tasks`    | `so ta`, `sort ta`, `so tasks`  |
| [View summary of task assignments in team](#view-summary-of-task-assignments-in-team-summary) | `summary`       | `su`, `sum`                     |
| [Add a new link](#add-a-new-link-add-link)                                                    | `add link`      | `a l`, `add l`, `a link`        |
| [Edit an existing link](#edit-an-existing-link-edit-link)                                     | `edit link`     | `e l`, `edit l`, `e link`       |
| [Delete an existing link](#delete-an-existing-link-delete-link)                               | `delete link`   | `d l`, `delete l`, `d link`     |
| [Clearing all entries](#clearing-all-entries-clear)                                           | `clear`         |                                 |
| [Switching between light and dark theme](#switching-between-light-and-dark-theme-theme)       | `theme`         | `th`                            |
| [Exiting the program](#exiting-the-program-exit)                                              | `exit`          | `ex`, `bye`, `quit`             |
| [Viewing help](#viewing-help-help)                                                            | `help`          | `h`                             |

[Back to Table of Contents](#table-of-contents)

### Flag And Parameter Constraints

| Parameter Name          | Flags                 | Constraints                                                                                                                    |
|-------------------------|-----------------------|--------------------------------------------------------------------------------------------------------------------------------|
| `PERSON_EMAIL`          | `-e`, `--email`       | - Only valid emails allowed<br/> - Click <a href="https://regex101.com/r/0huBLM/1" target="_blank">here to test your input</a> |
| `PERSON_NAME`           | `-n`,` --name`        | - Only alphabets, numbers, and spaces allowed, and should not be blank                                                         |
| `PERSON_PHONE`          | `-p`, `--phone`       | - Only numbers allowed<br/> - Minimum of 3 numbers                                                                             |
| `PERSON_TAGS`           | `-t`, `--tags`        | - Only alphabets and numbers are allowed, and should not be blank                                                              |
| `PERSON_INDEX`          |                       | - Only positive integers are allowed<br/> - Must be less than total number of persons in TruthTable                            |
| `MEMBER_INDEX`          |                       | - Only positive integers are allowed<br/> - Must be less than total number of members in TruthTable                            |
| `MEMBER_NAME_KEYWORDS`  | `-n`, `--name`        | - Only alphabets and numbers are allowed, and should not be blank                                                              |
| `MEMBER_EMAIL_KEYWORDS` | `-e`, `--email`       | - Only valid emails allowed<br/> - Click <a href="https://regex101.com/r/0huBLM/1" target="_blank">here to test your input</a> |
| `MEMBER_DESCRIPTION`    | `-d`, `--description` | - Only alphabets, numbers, and spaces are allowed, and should not be blank                                                     |
| `TEAM_NAME`             | `-n`, `--name`        | - Only alphabets and numbers are allowed, and should not be blank                                                              |
| `TASK_NAME`             | `-n`, `--name`        | - Any characters allowed, except quotes (`'` and `"`) and should not be blank                                                  |
| `TASK_INDEX`            |                       | - Only positive integers are allowed<br/> - Must be less than total number of tasks in selected team                           |
| `TASK_ASSIGNEES`        | `-a`, `--assignee`    | - Only positive integers are allowed<br/> - Must be less than total number of members in selected team                         |
| `TASK_DEADLINE`         | `-d`, `--deadline`    | - Must be in `YYYY-MM-DD HH:MM` format and cannot be blank<br/> - Date and time must be separated with a space                 |
| `TASK_NAME_KEYWORDS`    |                       | - Any characters allowed, except quotes (`'` and `"`) and spaces, and should not be blank                                      |
| `LINK_URL`              | `-l`, `--link`        | - Only valid URLs allowed<br/> - Click <a href="https://regex101.com/r/oW3Q3v/1" target="_blank">here to test your input</a>   |
| `LINK_NAME`             | `-n`, `--name`        | - Only alphabets, numbers, and spaces are allowed, and should not be blank                                                     |
| `LINK_INDEX`            |                       | - Only positive integers are allowed<br/> - Must be less than total number of links in selected team                           |
| `ORDER`                 |                       | - Only `asc`, `dsc`, and `res` allowed<br/> - Corresponds to ascending, descending, and reset respectively.                    |

[Back to Table of Contents](#table-of-contents)

### Summary of Person Commands

| Action                                                     | Format                                                                                                                    | Examples                                                                |
|------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------|
| [Creating a new person](#creating-a-new-person-add-person) | `add person [-h] -e=<EMAIL> -n=<NAME> -p=<PHONE> [-t[=<TAGS>...]]...`                                                     | `add person -n "John Doe" -p 98765432 -e johnd@example.com -t frontend` |
| [Editing a person](#editing-a-person-edit-person)          | `edit person [-h] ([-n=<PERSON_NAME>] [-p=<PERSON_PHONE>] [-e=<PERSON_EMAIL>] [-t[=<PERSON_TAGS>...]]...) <PERSON_INDEX>` | `edit person 1 -p 91234567 -e johndoe@example.com`                      |
| [Deleting a person](#deleting-a-person-delete-person)      | `delete person [-h] <PERSON_INDEX>`                                                                                       | `delete person 2`                                                       |
| [Finding a person](#finding-a-person-find-person)          | `find person [-h] <PERSON_NAME_KEYWORDS>`                                                                                 | `find person Alex`                                                      |
| [Listing all persons](#listing-all-persons-list-persons)   | `list persons [-h]`                                                                                                       | `list persons`                                                          |

[View detailed command descriptions](#commands-to-manage-persons)

[Back to Table of Contents](#table-of-contents)

### Summary of Member Commands

| Action                                                                           | Format                                                                                      | Examples                                                           |
|----------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|:-------------------------------------------------------------------|
| [Adding a new member to the team](#adding-a-new-member-to-the-team-add-member)   | `add member [-h] <PERSON_INDEX>`                                                            | `add member 1`                                                     |
| [Delete a member from team](#delete-a-member-from-team-delete-member)            | `delete member [-h] <MEMBER_INDEX>`                                                         | `delete member 2`                                                  |
| [Finding a member](#finding-a-member-find-member)                                | <code>find member [-h] (-n=<MEMBER_NAME_KEYWORDS> &#124; -e=<MEMBER_EMAIL_KEYWORDS>)</code> | - `find member -n Alex`<br>- `find member -e alexyeoh@example.com` |                                                                                             |                             |
| [Listing all members of the team](#listing-all-members-of-the-team-list-members) | `list members [-h]`                                                                         | `list members`                                                     |
| [Sort members](#sort-members-sort-members)                                       | `sort members [-h] <ORDER>`                                                                 | `sort members asc`                                                 |

[Back to Table of Contents](#table-of-contents)

### Summary of Team Commands

| Action                                                          | Format                                                      | Examples                                         |
|-----------------------------------------------------------------|-------------------------------------------------------------|:-------------------------------------------------|
| [Creating a new team](#creating-a-new-team-add-team)            | `add team [-h] [-d=TEAM_DESCRIPTION] <TEAM_NAME>`           | `add team CS2102 -d "Database Systems"`          |
| [Edit current team](#edit-current-team-edit-team)               | `edit team [-h] ([-n=<TEAM_NAME>] [-d=<TEAM_DESCRIPTION>])` | `edit team -n CS2103T -d "Software Engineering"` |
| [Delete an existing team](#delete-an-existing-team-delete-team) | `delete team [-h] <TEAM_NAME>`                              | `delete team CS2103T`                            |
| [Set a new team](#set-a-new-team-set-team)                      | `set team [-h] <TEAM_NAME>`                                 | `set team CS2103T`                               |

[Back to Table of Contents](#table-of-contents)

### Summary of Task Commands

| Action                                                                                        | Format                                                                                 | Examples                                          |
|-----------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|:--------------------------------------------------|
| [Add task to team](#add-task-to-team-add-task)                                                | `add task [-h] [-d=<TASK_DEADLINE>] [-a[=<TASK_ASSIGNEES>...]]... <TASK_NAME>`         | `add task "Merge PR" -a 1 -d 2022-12-02 23:59`    |
| [Edit task in team](#edit-task-in-team-edit-task)                                             | `edit task [-h] ([-n=<NAME>] [-d=<DEADLINE>] [-a[=<ASSIGNEES>...]]...) <TASK_INDEX>`   | `edit task 1 "Merge PR" -a 1 -d 2022-12-02 23:59` |
| [Delete task from team](#delete-task-from-team-delete-task)                                   | `delete task [-h] <TASK_INDEX>`                                                        | `delete task 1`                                   |
| [Finding a task](#finding-a-task-find-task)                                                   | `find task [-h] <TASK_NAME_KEYWORDS>`                                                  | `find task User Guide`                            |
| [Mark tasks as done](#mark-tasks-as-done-mark)                                                | `mark [-h] <TASK_INDEX>`                                                               | `mark 1`                                          |
| [Unmark tasks as done](#unmark-tasks-as-done-unmark)                                          | `unmark [-h] <TASK_INDEX>`                                                             | `unmark 1`                                        |
| [Set Deadline for task](#set-deadline-for-task-set-deadline)                                  | `set deadline [-h] <TASK_INDEX> <TASK_DEADLINE>`                                       | `set deadline 1 2023-12-25 23:59`                 |
| [Assign a task to team member](#assign-a-task-to-team-member-assign-task)                     | `assign task [-h] -a[=<TASK_ASSIGNEES>...] [-a[=<TASK_ASSIGNEES>...]]... <TASK_INDEX>` | `assign task 1 -a 1`                              |
| [Assign a task to random team member](#assign-a-task-to-random-team-member-assign-random)     | `assign random [-h] <TASK_INDEX>`                                                      | `assign random 1`                                 |
| [Filter tasks by team member](#filter-tasks-by-team-member-tasksof)                           | `tasksof [-h] <MEMBER_INDEX>`                                                          | `tasksof 1`                                       |
| [List tasks in team](#list-tasks-in-team-list-tasks)                                          | `list tasks [-h] [-c] [-i]`                                                            | `list tasks -i`                                   |
| [Sort tasks](#sort-tasks-sort-tasks)                                                          | `sort tasks [-h] <ORDER>`                                                              | `sort tasks asc`                                  |
| [View summary of task assignments in team](#view-summary-of-task-assignments-in-team-summary) | `summary [-h]`                                                                         | `summary`                                         |

[Back to Table of Contents](#table-of-contents)

### Summary of Link Commands

| Action                                                          | Format                                                           | Examples                                          |
|-----------------------------------------------------------------|------------------------------------------------------------------|:--------------------------------------------------|
| [Add a new link](#add-a-new-link-add-link)                      | `add link [-h] -l=<LINK_URL> -n=<LINK_NAME>`                     | `add link -n google -l https://google.com`        |
| [Edit an existing link](#edit-an-existing-link-edit-link)       | `edit link [-h] ([-n=<LINK_NAME>] [-l=<LINK_URL>]) <LINK_INDEX>` | `edit link 1 -n facebook -l https://facebook.com` |
| [Delete an existing link](#delete-an-existing-link-delete-link) | `delete link [-h] <LINK_INDEX>`                                  | `delete link 1`                                   |

[Back to Table of Contents](#table-of-contents)

### Summary of General Commands

| Action                                                                                  | Format       | Examples |
|-----------------------------------------------------------------------------------------|--------------|:---------|
| [Clearing all entries](#clearing-all-entries-clear)                                     | `clear [-h]` | `clear`  | 
| [Switching between light and dark theme](#switching-between-light-and-dark-theme-theme) | `theme [-h]` | `theme`  | 
| [Exiting the program](#exiting-the-program-exit)                                        | `exit [-h]`  | `exit`   | 
| [Viewing help](#viewing-help-help)                                                      | `help [-h]`  | `help`   | 

[Back to Table of Contents](#table-of-contents)

## Glossary

### Command

An instruction that is used to perform some feature.

Find out more in the [Understanding TruthTable's CLI section](#understanding-truthtables-cli).

### Parameter

Information that is used to modify [commands](#command), often used with [flags](#flag).

For instance, in the `edit person 1 -n Name` example command,

- `1` is the parameter for the `edit person` command (in this case, `1` refers to the index of a person).
- `Name` is the parameter for the flag `-n` (in this case, `Name` is the new name to be assigned to the person at
  index `1`).

Find out more in the [understanding TruthTable's CLI section](#understanding-truthtables-cli).

### Flag

Specific characters that are used to modify [commands](#command), often used with [flags](#flag).

For instance, in the `edit person 1 -n Name` example command,

- `-n` is a flag for the `edit person` command (in this case, `-n` is used to update the person's name)

Find out more in the [understanding TruthTable's CLI section](#understanding-truthtables-cli).

### Index

Refers to the position of an item in some collection.

Indexes must be positive integers, so they can only be 1, 2, 3, ...

For instance, in a list of 3 alphabets containing ("a", "b", "c") in that order,

- index 1 would refer to "a"
- index 2 would refer to "b"
- index 3 would refer to "c"

### Alias

An alias is used to indicate that a named item is also known as another specified name.

For instance,

- `e` is an alias for the `edit` command in TruthTable.

### Command Line Interface

A text-based [user interface](#user-interface) which allows the user to perform some action through the use of
[commands](#command).

Find out more in the [understanding TruthTable's CLI section](#understanding-truthtables-cli).

Examples include

- <a href="https://en.wikipedia.org/wiki/Unix_shell" target="_blank">Unix shells</a> like `sh`, `zsh`, `Bash`
- <a href="https://en.wikipedia.org/wiki/Cmd.exe" target="_blank">Command Prompt</a> in the Windows Operating System

### Graphical User Interface

A visual [user interface](#user-interface) which allows the user to interact with a program using visual elements such
as shapes, diagrams, and buttons.

Examples include

- Operating systems like Microsoft Windows, Apple's macOS, Apple's IOS, Linux

### User Interface

The user interface is some interface of which we interact with computers and devices in.

Examples include

- Monitors
- Keyboards

### Component

References a part of the user interface.

For instance, the input box in the [command section](#command-section) is a component of said section.

### JSON File

A file which is used to store data, which adheres to a format called
<a href="https://en.wikipedia.org/wiki/JSON" target="_blank">JavaScript Object Notation (JSON)</a>.

[Back to Table of Contents](#table-of-contents)

