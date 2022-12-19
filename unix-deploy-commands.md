# Deploy commands

## Getting the software on your instance
```cli
sudo yum install git # this installs git on you instance

sudo amazon-linux-extras install java-openjdk11 # this installs java 11

sudo yum install maven # this installs maven (might not be up to date)
```

## Clone the repo of source code to your instance
```cli
git clone {repo link}
```


## Use maven to build your app
```cli
mvn package # build plugin versions might need to be adjusted for this to work
```

## Run your app
```cli
java -jar target/{jar_file} # this runs the app directly in your terminal, prevents you from interacting further

nohup java -jar target/{jar_file} & # this runs the app in the background and redirects all stdout to a file
called nohup.out in the same directory you executed the command in 
```

## Move foreground app into background
```cli
ctr + z # this will stop the process and move it into the background
```

## Move background process into foreground
```cli
jobs # this will give you the job number of the background process

fg %(job number) # this will move the job from the background into the foreground
```

## Killing process
```cli
ps # returns all current processes and their PID numbers

kill {pid of job to kill} # this tells unix to try and stop the process

kill -9 {pid of job to kill} # this tells unix to force the process to end. Can cause issues if there are supposed
to be shutdown operations
```