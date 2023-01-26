# noodle-spring-boot-camunda

### Start App
http://localhost:8888/noodles/workflow/application<br>
```json
{
    "customerName": "test1",
    "NOODLES": true,
    "ONION": true,
    "TOMATO": false,
    "CHEESE": false,
    "PEPPER": false,
    "CARROT": true,
    "WATER": true,
    "PAN": true,
    "WOK": false,
    "KNIFE": false,
    "FORK": true,
    "SPOON": false,
    "CUTTING_BOARD": true,
    "BOWL": true,
    "SPATULA": true
}
```

### Send cooked message
http://localhost:8888/noodles/engine-rest/message<br>
```json
{
    "messageName": "noodleCooked",
    "businessKey": "1234",
    "processVaraibles": {
        "cooked": {"value": true, "type": "Boolean"}
    }

}
```
