# Hyperfoil Http Extension
This repository aims to showcase how users can _easily_ extend Hyperfoil leveraging the already existing HTTP plugin by
creating custom components (steps, actions, handlers, etc.) to interact with.

## Build the extension

As first step you should build the extension and create the jar

```bash
mvn clean package
```

## Use the extension

First of all, download the Hyperfoil distribution and unzip it.
After that you should see the following structure:

```bash
$ tree -L 1
.
├── bin
├── docs
├── examples
├── extensions
├── lib
└── templates
```

Copy the created jar inside the `extensions` folder

```bash
# from this repository
cp target/hyperfoil-http-extension-1.0-SNAPSHOT.jar <hyperfoil-distribution>/extensions/
```

Run Hyperfoil, as you prefer either as `standalone` or `in-vm`.
After that, upload and run the following benchmark:

```yaml
name: first-benchmark
http:
  host: http://localhost:8080
  sharedConnections: 10
maxSessions: 50
duration: 10s
usersPerSec: 30
scenario:
  - fetch:
      - extendedHttpRequest:
          GET: /
```

As you would see, you will actually use your new extension!!!